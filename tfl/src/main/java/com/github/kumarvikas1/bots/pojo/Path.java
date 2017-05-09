
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Path {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("elevation")
    private List<Object> mElevation;
    @JsonProperty("lineString")
    private String mLineString;
    @JsonProperty("stopPoints")
    private List<Object> mStopPoints;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public List<Object> getElevation() {
        return mElevation;
    }

    public void setElevation(List<Object> elevation) {
        mElevation = elevation;
    }

    public String getLineString() {
        return mLineString;
    }

    public void setLineString(String lineString) {
        mLineString = lineString;
    }

    public List<Object> getStopPoints() {
        return mStopPoints;
    }

    public void setStopPoints(List<Object> stopPoints) {
        mStopPoints = stopPoints;
    }

}
