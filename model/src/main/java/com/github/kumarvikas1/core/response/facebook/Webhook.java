package com.github.kumarvikas1.core.response.facebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;
import com.github.kumarvikas1.core.request.facebook.pojo.Recipient;

/**
 * Created by vikakumar on 4/28/17.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class Webhook {

    @JsonProperty("recipient")
    private Recipient recipient;

    @JsonProperty("message")
    private Message message;

    public Recipient getRecipient() {
        return recipient;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Message getMessage() {
        return message;
    }
}
