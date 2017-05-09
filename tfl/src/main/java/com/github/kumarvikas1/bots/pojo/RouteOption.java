
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RouteOption {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("directions")
    private List<String> mDirections;
    @JsonProperty("name")
    private String mName;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public List<String> getDirections() {
        return mDirections;
    }

    public void setDirections(List<String> directions) {
        mDirections = directions;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

}
