package com.github.kumarvikas1.core.request.facebook.pojo;

import java.util.List;

/**
 * Created by vikakumar on 4/28/17.
 */
public class Entry {
    private String id;
    private Long time;
    private List<Messaging> messaging = null;


    public void setId(String id) {
        this.id = id;
    }

    public void setMessaging(List<Messaging> messaging) {
        this.messaging = messaging;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public List<Messaging> getMessaging() {
        return messaging;
    }

    public String getId() {
        return id;
    }
}
