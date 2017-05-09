package com.github.kumarvikas1.core.response.facebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikakumar on 4/29/17.
 */
@JsonSerialize(include = Inclusion.NON_NULL)
public class Message {
    @JsonProperty("text")
    private String text;
    @JsonProperty("quick_replies")
    private List<QuickReply> mQuickReplies;


    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }


    public List<QuickReply> getmQuickReplies() {
        return mQuickReplies;
    }

    public void setmQuickReplies(List<QuickReply> mQuickReplies) {
        this.mQuickReplies = mQuickReplies;
    }


    public static class Builder {
        private String text;
        private List<QuickReply> mQuickReplies = new ArrayList<>();

        public Builder withText(String text) {
            this.text = text;
            return this;
        }

        public Builder withQuickReply(QuickReply quickReply) {
            mQuickReplies.add(quickReply);
            return this;
        }

        public Message build() {
            Message message = new Message();
            if (!mQuickReplies.isEmpty()) {
                message.setmQuickReplies(mQuickReplies);
            }
            message.setText(text);
            return message;
        }
    }
}
