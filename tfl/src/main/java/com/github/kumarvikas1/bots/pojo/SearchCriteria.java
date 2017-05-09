
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchCriteria {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("dateTime")
    private String mDateTime;
    @JsonProperty("dateTimeType")
    private String mDateTimeType;
    @JsonProperty("timeAdjustments")
    private TimeAdjustments mTimeAdjustments;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public String getDateTime() {
        return mDateTime;
    }

    public void setDateTime(String dateTime) {
        mDateTime = dateTime;
    }

    public String getDateTimeType() {
        return mDateTimeType;
    }

    public void setDateTimeType(String dateTimeType) {
        mDateTimeType = dateTimeType;
    }

    public TimeAdjustments getTimeAdjustments() {
        return mTimeAdjustments;
    }

    public void setTimeAdjustments(TimeAdjustments timeAdjustments) {
        mTimeAdjustments = timeAdjustments;
    }

}
