
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Latest {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("date")
    private String mDate;
    @JsonProperty("time")
    private String mTime;
    @JsonProperty("timeIs")
    private String mTimeIs;
    @JsonProperty("uri")
    private String mUri;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        mDate = date;
    }

    public String getTime() {
        return mTime;
    }

    public void setTime(String time) {
        mTime = time;
    }

    public String getTimeIs() {
        return mTimeIs;
    }

    public void setTimeIs(String timeIs) {
        mTimeIs = timeIs;
    }

    public String getUri() {
        return mUri;
    }

    public void setUri(String uri) {
        mUri = uri;
    }

}
