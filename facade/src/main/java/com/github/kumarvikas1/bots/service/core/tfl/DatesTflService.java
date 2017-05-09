package com.github.kumarvikas1.bots.service.core.tfl;

import com.github.kumarvikas1.bots.enums.Flows;
import com.github.kumarvikas1.bots.model.Chats;
import com.github.kumarvikas1.bots.service.TflResponse;
import com.github.kumarvikas1.bots.service.core.MessageService;
import com.github.kumarvikas1.core.chat.BotRequest;
import com.github.kumarvikas1.core.chat.FacebookRequest;
import com.github.kumarvikas1.core.chat.HipChatRequest;
import com.github.kumarvikas1.core.response.facebook.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public class DatesTflService extends MessageService {

    public static final String TRAVEL_FROM_A_Z0_9_TO_A_Z0_9 = "[A-Z0-9]+ to [A-Z0-9]+";
    public static final String DESTINATION = ".*travel from [A-Z0-9]+ to [A-Z0-9]+";
    public static final String D_4_D_2_D_2 = "\\d{4}-\\d{2}-\\d{2}";

    @Autowired
    TflResponse tflResponse;

    @Override
    public CompletableFuture<Message> message(BotRequest botRequest, MessageService messageService, List<Chats> chatsList) {
        try {
            Matcher matcher = Pattern.compile(TRAVEL_FROM_A_Z0_9_TO_A_Z0_9).matcher(getTflMessage(chatsList));
            matcher.find();
            return tflResponse.travel(matcher.group(0).split(" ")[0], matcher.group(0).split(" ")[2], getDestination(botRequest));
        } catch (NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
            Message message = new Message();
            message.setText("Sorry, couldn't understand");
            return CompletableFuture.completedFuture(message);
        }
    }

    private String getDestination(BotRequest botRequest) {
        if (botRequest instanceof FacebookRequest) {
            return getRequestMessage(botRequest).matches(D_4_D_2_D_2) ?
                    getRequestMessage(botRequest) : Arrays.asList(TflPayloads.values()).stream().
                    filter(f -> f.toString().equals(getRequestMessage(botRequest))).findFirst().get().getDates().get().replaceAll("-", "");
        } else {
            return ((HipChatRequest) botRequest).getMessage().getMessage();
        }
    }


    @Override
    public Boolean applies(BotRequest botRequest) {
        return getRequestMessage(botRequest).matches(D_4_D_2_D_2) || Arrays.asList(TflPayloads.values()).stream().anyMatch(f -> f.toString().equals(getRequestMessage(botRequest)));
    }

    private String getRequestMessage(BotRequest botRequest) {
        return botRequest instanceof FacebookRequest ? Optional.ofNullable(getFaceBookRequest(botRequest).getMessage().getQuick_reply())
                .map(com.github.kumarvikas1.core.request.facebook.pojo.QuickReply::getPayload).orElse(getFaceBookRequest(botRequest).getMessage().getText()) :
                ((HipChatRequest) botRequest).getMessage().getMessage();
    }

    private FacebookRequest getFaceBookRequest(BotRequest botRequest) {
        return (FacebookRequest) botRequest;
    }


    private String getTflMessage(List<Chats> chatsList) {
        return getRequestMessage(chatsList.stream().filter(f -> f.getFlows().equals(Flows.TFL) && getRequestMessage(f.getBotRequest()).matches(DESTINATION)).findFirst().get()
                .getBotRequest());
    }


    @Override
    public Flows ofFlow() {
        return Flows.TFL;
    }


    @Override
    public Boolean isFlowDone() {
        return true;
    }
}
