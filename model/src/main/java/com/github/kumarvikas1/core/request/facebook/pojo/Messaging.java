package com.github.kumarvikas1.core.request.facebook.pojo;

/**
 * Created by vikakumar on 4/28/17.
 */
public class Messaging {
    private Sender sender;
    private Recipient recipient;
    private Long timestamp;
    private Message message;

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public Message getMessage() {
        return message;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public Sender getSender() {
        return sender;
    }
}
