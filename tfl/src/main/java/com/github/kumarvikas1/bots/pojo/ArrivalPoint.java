
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ArrivalPoint {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("commonName")
    private String mCommonName;
    @JsonProperty("lat")
    private Double mLat;
    @JsonProperty("lon")
    private Double mLon;
    @JsonProperty("placeType")
    private String mPlaceType;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public String getCommonName() {
        return mCommonName;
    }

    public void setCommonName(String commonName) {
        mCommonName = commonName;
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

}
