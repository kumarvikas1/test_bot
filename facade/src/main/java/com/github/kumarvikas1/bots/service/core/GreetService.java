package com.github.kumarvikas1.bots.service.core;

import com.github.kumarvikas1.bots.enums.Flows;
import com.github.kumarvikas1.bots.model.Chats;
import com.github.kumarvikas1.core.chat.BotRequest;
import com.github.kumarvikas1.core.chat.FacebookRequest;
import com.github.kumarvikas1.core.chat.HipChatRequest;
import com.github.kumarvikas1.core.response.facebook.Message;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public class GreetService extends MessageService {

    @Override
    public CompletableFuture<Message> message(BotRequest botRequest, MessageService messageService, List<Chats> chatsList) {
        return CompletableFuture.completedFuture(new Message.Builder().withText("Hey, How Can I Help").build());
    }

    @Override
    public Flows ofFlow() {
        return Flows.STANDARD;
    }

    @Override
    public Boolean isFlowDone() {
        return false;
    }

    @Override
    public Boolean applies(BotRequest botRequest) {
        if (botRequest instanceof FacebookRequest) {
            return ((FacebookRequest) botRequest).getMessage().getText().matches("[Hh][iI]");
        } else {
            return ((HipChatRequest) botRequest).getMessage().getMessage().matches("[Hh][iI]");
        }

    }
}
