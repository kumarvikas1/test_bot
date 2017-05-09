
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Journey {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("arrivalDateTime")
    private String mArrivalDateTime;
    @JsonProperty("duration")
    private Long mDuration;
    @JsonProperty("legs")
    private List<Leg> mLegs;
    @JsonProperty("startDateTime")
    private String mStartDateTime;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public String getArrivalDateTime() {
        return mArrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        mArrivalDateTime = arrivalDateTime;
    }

    public Long getDuration() {
        return mDuration;
    }

    public void setDuration(Long duration) {
        mDuration = duration;
    }

    public List<Leg> getLegs() {
        return mLegs;
    }

    public void setLegs(List<Leg> legs) {
        mLegs = legs;
    }

    public String getStartDateTime() {
        return mStartDateTime;
    }

    public void setStartDateTime(String startDateTime) {
        mStartDateTime = startDateTime;
    }

}
