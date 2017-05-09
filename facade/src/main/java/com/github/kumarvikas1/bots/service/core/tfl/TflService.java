package com.github.kumarvikas1.bots.service.core.tfl;

import com.github.kumarvikas1.bots.enums.Flows;
import com.github.kumarvikas1.bots.model.Chats;
import com.github.kumarvikas1.bots.service.core.MessageService;
import com.github.kumarvikas1.core.chat.BotRequest;
import com.github.kumarvikas1.core.chat.FacebookRequest;
import com.github.kumarvikas1.core.chat.HipChatRequest;
import com.github.kumarvikas1.core.response.facebook.Message;
import com.github.kumarvikas1.core.response.facebook.QuickReply;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public class TflService extends MessageService {

    @Override
    public Flows ofFlow() {
        return Flows.TFL;
    }

    @Override
    public Boolean isFlowDone() {
        return false;
    }

    @Override
    public Boolean applies(BotRequest botRequest) {
        return (botRequest instanceof FacebookRequest ? ((FacebookRequest) botRequest).getMessage().getText()
                : ((HipChatRequest) botRequest).getMessage().getMessage())
                .matches(".*travel from [A-Z0-9]+ to [A-Z0-9]+");
    }

    @Override
    public CompletableFuture<Message> message(BotRequest botRequest, MessageService messageService, List<Chats> chatsList) {
        Message message = new Message.Builder().withText("ok, when do you want to travel").withQuickReply(
                new QuickReply.Builder().withContentType("text")
                        .withTitle("Today").
                        withPayload(TflPayloads.Tfl_date_today.toString()).build()).
                withQuickReply(
                        new QuickReply.Builder().withContentType("text")
                                .withTitle("Tomorrow").
                                withPayload(TflPayloads.Tfl_date_tomorrow.toString()).build()).
                build();
        return CompletableFuture.completedFuture(message);
    }
}
