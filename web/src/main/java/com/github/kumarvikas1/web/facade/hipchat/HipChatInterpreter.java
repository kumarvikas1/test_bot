package com.github.kumarvikas1.web.facade.hipchat;

import com.github.kumarvikas1.bots.service.ChatBotService;
import com.github.kumarvikas1.core.chat.HipChatRequest;
import com.github.kumarvikas1.core.response.hipchat.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;

/**
 * Created by vikakumar on 5/1/17.
 */
@Component
public class HipChatInterpreter {


    @Autowired
    ChatBotService chatBotService;

    public Text interpret(HipChatRequest hipChatRequest) {
        Text text = new Text();
        text.setColor("green");
        try {
            text.setMessage(chatBotService.getMessage(hipChatRequest).get().getText());
        } catch (InterruptedException | ExecutionException e) {
            text.setMessage("Oops, Please try again!");
        }
        text.setMessage_format("text");
        return text;
    }
}
