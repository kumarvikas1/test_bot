package com.github.kumarvikas1.core.response.hipchat;

/**
 * Created by vikakumar on 4/28/17.
 */
public class Text {

    private String color;
    private String message;
    private boolean notify;
    private String message_format;

    public void setColor(String color) {
        this.color = color;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setMessage_format(String message_format) {
        this.message_format = message_format;
    }

    public void setNotify(boolean notify) {
        this.notify = notify;
    }

    public String getColor() {
        return color;
    }

    public String getMessage() {
        return message;
    }

    public String getMessage_format() {
        return message_format;
    }

    public boolean isNotify() {
        return notify;
    }
}
