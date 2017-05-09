package com.github.kumarvikas1.bots.service;

import com.github.kumarvikas1.bots.model.Chats;
import com.github.kumarvikas1.bots.service.core.GreetService;
import com.github.kumarvikas1.bots.service.core.MessageService;
import com.github.kumarvikas1.core.chat.BotRequest;
import com.github.kumarvikas1.core.chat.FacebookRequest;
import com.github.kumarvikas1.core.response.facebook.Message;
import com.google.common.collect.Iterables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public class ChatBotService {

    private List<Chats> chatsList = new ArrayList<>();

    @Autowired
    List<MessageService> messageServices;

    protected void addChat(Chats chat) {
        chatsList.add(chat);
    }

    public List<Chats> getChatsList() {
        return chatsList;
    }

    public CompletableFuture<Message> getMessage(BotRequest botRequest) {
        MessageService messageService = messageServices.stream().filter(f -> f.applies(botRequest)).findFirst().orElse(new GreetService());
        CompletableFuture<Message> retval = messageService.message(botRequest, messageService, chatsList);
        handleFlowsData(botRequest, messageService);
        return retval;
    }

    protected void handleFlowsData(BotRequest botRequest, MessageService messageService) {
        if (messageService.isFlowDone()) {
            Iterables.removeIf(getChatsList(), f -> f.getFlows().equals(messageService.ofFlow()));
        } else {
            addChat(Chats.of(botRequest instanceof FacebookRequest ? ((FacebookRequest) botRequest).getUserId()
                    : "HipChats", messageService.ofFlow(), botRequest));
        }
    }
}
