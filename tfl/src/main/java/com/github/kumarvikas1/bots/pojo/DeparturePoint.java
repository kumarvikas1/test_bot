
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DeparturePoint {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("additionalProperties")
    private List<Object> mAdditionalProperties;
    @JsonProperty("commonName")
    private String mCommonName;
    @JsonProperty("icsCode")
    private String mIcsCode;
    @JsonProperty("lat")
    private Double mLat;
    @JsonProperty("lon")
    private Double mLon;
    @JsonProperty("placeType")
    private String mPlaceType;
    @JsonProperty("platformName")
    private String mPlatformName;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public List<Object> getAdditionalProperties() {
        return mAdditionalProperties;
    }

    public void setAdditionalProperties(List<Object> additionalProperties) {
        mAdditionalProperties = additionalProperties;
    }

    public String getCommonName() {
        return mCommonName;
    }

    public void setCommonName(String commonName) {
        mCommonName = commonName;
    }

    public String getIcsCode() {
        return mIcsCode;
    }

    public void setIcsCode(String icsCode) {
        mIcsCode = icsCode;
    }

    public Double getLat() {
        return mLat;
    }

    public void setLat(Double lat) {
        mLat = lat;
    }

    public Double getLon() {
        return mLon;
    }

    public void setLon(Double lon) {
        mLon = lon;
    }

    public String getPlaceType() {
        return mPlaceType;
    }

    public void setPlaceType(String placeType) {
        mPlaceType = placeType;
    }

    public String getPlatformName() {
        return mPlatformName;
    }

    public void setPlatformName(String platformName) {
        mPlatformName = platformName;
    }

}
