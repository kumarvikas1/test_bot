package com.github.kumarvikas1.core.request.hipchat.pojo;

import java.util.List;

/**
 * Created by vikakumar on 4/28/17.
 */
public class Message {


    private String date;
    private From from;
    private String id;
    private List<Object> mentions = null;
    private String message;
    private String type;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getMentions() {
        return mentions;
    }

    public void setMentions(List<Object> mentions) {
        this.mentions = mentions;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}