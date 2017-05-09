package com.github.kumarvikas1.core.chat;


import com.github.kumarvikas1.core.request.hipchat.pojo.Message;

/**
 * Created by vikakumar on 5/1/17.
 */
public class HipChatRequest implements BotRequest {
    private Message message;

    public void setMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }

    public static HipChatRequest get(Message message) {
        HipChatRequest hipChatRequest = new HipChatRequest();
        message.setMessage(message.getMessage().replace("/health ", ""));
        hipChatRequest.setMessage(message);
        return hipChatRequest;
    }
}
