
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Instruction {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("detailed")
    private String mDetailed;
    @JsonProperty("steps")
    private List<Step> mSteps;
    @JsonProperty("summary")
    private String mSummary;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public String getDetailed() {
        return mDetailed;
    }

    public void setDetailed(String detailed) {
        mDetailed = detailed;
    }

    public List<Step> getSteps() {
        return mSteps;
    }

    public void setSteps(List<Step> steps) {
        mSteps = steps;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

}
