package com.github.kumarvikas1.core.request.hipchat.pojo;

/**
 * Created by vikakumar on 4/28/17.
 */
public class Request {

    private Item item;
    private String webhook_id;
    private String event;


    public Item getItem() {
        return item;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getEvent() {
        return event;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getWebhook_id() {
        return webhook_id;
    }

    public void setWebhook_id(String webhook_id) {
        this.webhook_id = webhook_id;
    }
}
