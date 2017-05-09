package com.github.kumarvikas1.web.facade.facebook;

import com.github.kumarvikas1.bots.service.ChatBotService;
import com.github.kumarvikas1.core.chat.FacebookRequest;
import com.github.kumarvikas1.core.request.facebook.pojo.Recipient;
import com.github.kumarvikas1.core.response.facebook.Webhook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public class FacebookInterpreter {

    @Autowired
    ChatBotService facebookService;

    public Webhook interpret(FacebookRequest facebookRequest) {
        Webhook retval = new Webhook();
        Recipient recipient = new Recipient();
        recipient.setId(facebookRequest.getUserId());
        retval.setRecipient(recipient);
        try {
            retval.setMessage(facebookService.getMessage(facebookRequest).get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return retval;
    }
}
