
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimeAdjustments {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("earlier")
    private Earlier mEarlier;
    @JsonProperty("earliest")
    private Earliest mEarliest;
    @JsonProperty("later")
    private Later mLater;
    @JsonProperty("latest")
    private Latest mLatest;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public Earlier getEarlier() {
        return mEarlier;
    }

    public void setEarlier(Earlier earlier) {
        mEarlier = earlier;
    }

    public Earliest getEarliest() {
        return mEarliest;
    }

    public void setEarliest(Earliest earliest) {
        mEarliest = earliest;
    }

    public Later getLater() {
        return mLater;
    }

    public void setLater(Later later) {
        mLater = later;
    }

    public Latest getLatest() {
        return mLatest;
    }

    public void setLatest(Latest latest) {
        mLatest = latest;
    }

}
