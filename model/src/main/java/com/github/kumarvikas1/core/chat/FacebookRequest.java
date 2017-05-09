package com.github.kumarvikas1.core.chat;

import com.github.kumarvikas1.core.request.facebook.pojo.Message;

/**
 * Created by vikakumar on 5/1/17.
 */
public class FacebookRequest implements BotRequest {

    private Message message;
    private String userId;


    public void setMessage(Message message) {
        this.message = message;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Message getMessage() {
        return message;
    }

    public String getUserId() {
        return userId;
    }


    public static FacebookRequest of(Message message, String userId) {
        FacebookRequest facebookRequest = new FacebookRequest();
        facebookRequest.setMessage(message);
        facebookRequest.setUserId(userId);
        return facebookRequest;
    }
}
