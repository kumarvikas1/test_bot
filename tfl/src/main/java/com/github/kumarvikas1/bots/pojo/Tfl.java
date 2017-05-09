
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Tfl {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("journeyVector")
    private JourneyVector mJourneyVector;
    @JsonProperty("journeys")
    private List<Journey> mJourneys;
    @JsonProperty("lines")
    private List<Object> mLines;
    @JsonProperty("recommendedMaxAgeMinutes")
    private Long mRecommendedMaxAgeMinutes;
    @JsonProperty("searchCriteria")
    private SearchCriteria mSearchCriteria;
    @JsonProperty("stopMessages")
    private List<Object> mStopMessages;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public JourneyVector getJourneyVector() {
        return mJourneyVector;
    }

    public void setJourneyVector(JourneyVector journeyVector) {
        mJourneyVector = journeyVector;
    }

    public List<Journey> getJourneys() {
        return mJourneys;
    }

    public void setJourneys(List<Journey> journeys) {
        mJourneys = journeys;
    }

    public List<Object> getLines() {
        return mLines;
    }

    public void setLines(List<Object> lines) {
        mLines = lines;
    }

    public Long getRecommendedMaxAgeMinutes() {
        return mRecommendedMaxAgeMinutes;
    }

    public void setRecommendedMaxAgeMinutes(Long recommendedMaxAgeMinutes) {
        mRecommendedMaxAgeMinutes = recommendedMaxAgeMinutes;
    }

    public SearchCriteria getSearchCriteria() {
        return mSearchCriteria;
    }

    public void setSearchCriteria(SearchCriteria searchCriteria) {
        mSearchCriteria = searchCriteria;
    }

    public List<Object> getStopMessages() {
        return mStopMessages;
    }

    public void setStopMessages(List<Object> stopMessages) {
        mStopMessages = stopMessages;
    }

}
