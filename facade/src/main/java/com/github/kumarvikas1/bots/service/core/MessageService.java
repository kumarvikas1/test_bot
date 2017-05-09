package com.github.kumarvikas1.bots.service.core;

import com.github.kumarvikas1.bots.enums.Flows;
import com.github.kumarvikas1.bots.model.Chats;
import com.github.kumarvikas1.core.chat.BotRequest;
import com.github.kumarvikas1.core.response.facebook.Message;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public abstract class MessageService {

    public abstract CompletableFuture<Message> message(BotRequest botRequest, MessageService messageService, List<Chats> chatsList);

    public abstract Flows ofFlow();

    public abstract Boolean isFlowDone();

    public abstract Boolean applies(BotRequest botRequest);
}
