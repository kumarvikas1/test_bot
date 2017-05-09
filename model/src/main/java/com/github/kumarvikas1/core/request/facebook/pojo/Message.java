package com.github.kumarvikas1.core.request.facebook.pojo;

/**
 * Created by vikakumar on 4/28/17.
 */
public class Message {
    private String mid;
    private Integer seq;
    private String text;
    private QuickReply quick_reply;


    public void setQuick_reply(QuickReply quick_reply) {
        this.quick_reply = quick_reply;
    }

    public QuickReply getQuick_reply() {
        return quick_reply;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getSeq() {
        return seq;
    }

    public String getMid() {
        return mid;
    }

    public String getText() {
        return text;
    }
}
