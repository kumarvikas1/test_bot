
package com.github.kumarvikas1.core.response.facebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonSerialize(include = Inclusion.NON_NULL)
public class QuickReply {

    @JsonProperty("content_type")
    private String contentType;
    @JsonProperty("payload")
    private String mPayload;
    @JsonProperty("title")
    private String mTitle;

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    public String getPayload() {
        return mPayload;
    }

    public void setPayload(String payload) {
        mPayload = payload;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public static class Builder {
        private String contentType;
        private String mPayload;
        private String mTitle;


        public Builder withContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder withPayload(String payload) {
            this.mPayload = payload;
            return this;
        }

        public Builder withTitle(String title) {
            this.mTitle = title;
            return this;
        }


        public QuickReply build() {
            QuickReply quickReply = new QuickReply();
            quickReply.setContentType(contentType);
            quickReply.setPayload(mPayload);
            quickReply.setTitle(mTitle);
            return quickReply;

        }

    }
}
