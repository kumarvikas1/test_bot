
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JourneyVector {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("from")
    private String mFrom;
    @JsonProperty("to")
    private String mTo;
    @JsonProperty("uri")
    private String mUri;
    @JsonProperty("via")
    private String mVia;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public String getFrom() {
        return mFrom;
    }

    public void setFrom(String from) {
        mFrom = from;
    }

    public String getTo() {
        return mTo;
    }

    public void setTo(String to) {
        mTo = to;
    }

    public String getUri() {
        return mUri;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

    public String getVia() {
        return mVia;
    }

    public void setVia(String via) {
        mVia = via;
    }

}
