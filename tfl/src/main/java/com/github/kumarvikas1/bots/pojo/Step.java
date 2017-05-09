
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Step {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("cumulativeDistance")
    private Long mCumulativeDistance;
    @JsonProperty("cumulativeTravelTime")
    private Long mCumulativeTravelTime;
    @JsonProperty("description")
    private String mDescription;
    @JsonProperty("descriptionHeading")
    private String mDescriptionHeading;
    @JsonProperty("distance")
    private Long mDistance;
    @JsonProperty("latitude")
    private Double mLatitude;
    @JsonProperty("longitude")
    private Double mLongitude;
    @JsonProperty("pathAttribute")
    private PathAttribute mPathAttribute;
    @JsonProperty("skyDirection")
    private Long mSkyDirection;
    @JsonProperty("skyDirectionDescription")
    private String mSkyDirectionDescription;
    @JsonProperty("streetName")
    private String mStreetName;
    @JsonProperty("trackType")
    private String mTrackType;
    @JsonProperty("turnDirection")
    private String mTurnDirection;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public Long getCumulativeDistance() {
        return mCumulativeDistance;
    }

    public void setCumulativeDistance(Long cumulativeDistance) {
        mCumulativeDistance = cumulativeDistance;
    }

    public Long getCumulativeTravelTime() {
        return mCumulativeTravelTime;
    }

    public void setCumulativeTravelTime(Long cumulativeTravelTime) {
        mCumulativeTravelTime = cumulativeTravelTime;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public String getDescriptionHeading() {
        return mDescriptionHeading;
    }

    public void setDescriptionHeading(String descriptionHeading) {
        mDescriptionHeading = descriptionHeading;
    }

    public Long getDistance() {
        return mDistance;
    }

    public void setDistance(Long distance) {
        mDistance = distance;
    }

    public Double getLatitude() {
        return mLatitude;
    }

    public void setLatitude(Double latitude) {
        mLatitude = latitude;
    }

    public Double getLongitude() {
        return mLongitude;
    }

    public void setLongitude(Double longitude) {
        mLongitude = longitude;
    }

    public PathAttribute getPathAttribute() {
        return mPathAttribute;
    }

    public void setPathAttribute(PathAttribute pathAttribute) {
        mPathAttribute = pathAttribute;
    }

    public Long getSkyDirection() {
        return mSkyDirection;
    }

    public void setSkyDirection(Long skyDirection) {
        mSkyDirection = skyDirection;
    }

    public String getSkyDirectionDescription() {
        return mSkyDirectionDescription;
    }

    public void setSkyDirectionDescription(String skyDirectionDescription) {
        mSkyDirectionDescription = skyDirectionDescription;
    }

    public String getStreetName() {
        return mStreetName;
    }

    public void setStreetName(String streetName) {
        mStreetName = streetName;
    }

    public String getTrackType() {
        return mTrackType;
    }

    public void setTrackType(String trackType) {
        mTrackType = trackType;
    }

    public String getTurnDirection() {
        return mTurnDirection;
    }

    public void setTurnDirection(String turnDirection) {
        mTurnDirection = turnDirection;
    }

}
