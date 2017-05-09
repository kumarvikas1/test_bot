
package com.github.kumarvikas1.bots.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Leg {

    @JsonProperty("$type")
    private String m$type;
    @JsonProperty("arrivalPoint")
    private ArrivalPoint mArrivalPoint;
    @JsonProperty("arrivalTime")
    private String mArrivalTime;
    @JsonProperty("departurePoint")
    private DeparturePoint mDeparturePoint;
    @JsonProperty("departureTime")
    private String mDepartureTime;
    @JsonProperty("disruptions")
    private List<Object> mDisruptions;
    @JsonProperty("distance")
    private Double mDistance;
    @JsonProperty("duration")
    private Long mDuration;
    @JsonProperty("hasFixedLocations")
    private Boolean mHasFixedLocations;
    @JsonProperty("instruction")
    private Instruction mInstruction;
    @JsonProperty("isDisrupted")
    private Boolean mIsDisrupted;
    @JsonProperty("mode")
    private Mode mMode;
    @JsonProperty("obstacles")
    private List<Object> mObstacles;
    @JsonProperty("path")
    private Path mPath;
    @JsonProperty("plannedWorks")
    private List<Object> mPlannedWorks;
    @JsonProperty("routeOptions")
    private List<RouteOption> mRouteOptions;

    public String get$type() {
        return m$type;
    }

    public void set$type(String $type) {
        m$type = $type;
    }

    public ArrivalPoint getArrivalPoint() {
        return mArrivalPoint;
    }

    public void setArrivalPoint(ArrivalPoint arrivalPoint) {
        mArrivalPoint = arrivalPoint;
    }

    public String getArrivalTime() {
        return mArrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        mArrivalTime = arrivalTime;
    }

    public DeparturePoint getDeparturePoint() {
        return mDeparturePoint;
    }

    public void setDeparturePoint(DeparturePoint departurePoint) {
        mDeparturePoint = departurePoint;
    }

    public String getDepartureTime() {
        return mDepartureTime;
    }

    public void setDepartureTime(String departureTime) {
        mDepartureTime = departureTime;
    }

    public List<Object> getDisruptions() {
        return mDisruptions;
    }

    public void setDisruptions(List<Object> disruptions) {
        mDisruptions = disruptions;
    }

    public Double getDistance() {
        return mDistance;
    }

    public void setDistance(Double distance) {
        mDistance = distance;
    }

    public Long getDuration() {
        return mDuration;
    }

    public void setDuration(Long duration) {
        mDuration = duration;
    }

    public Boolean getHasFixedLocations() {
        return mHasFixedLocations;
    }

    public void setHasFixedLocations(Boolean hasFixedLocations) {
        mHasFixedLocations = hasFixedLocations;
    }

    public Instruction getInstruction() {
        return mInstruction;
    }

    public void setInstruction(Instruction instruction) {
        mInstruction = instruction;
    }

    public Boolean getIsDisrupted() {
        return mIsDisrupted;
    }

    public void setIsDisrupted(Boolean isDisrupted) {
        mIsDisrupted = isDisrupted;
    }

    public Mode getMode() {
        return mMode;
    }

    public void setMode(Mode mode) {
        mMode = mode;
    }

    public List<Object> getObstacles() {
        return mObstacles;
    }

    public void setObstacles(List<Object> obstacles) {
        mObstacles = obstacles;
    }

    public Path getPath() {
        return mPath;
    }

    public void setPath(Path path) {
        mPath = path;
    }

    public List<Object> getPlannedWorks() {
        return mPlannedWorks;
    }

    public void setPlannedWorks(List<Object> plannedWorks) {
        mPlannedWorks = plannedWorks;
    }

    public List<RouteOption> getRouteOptions() {
        return mRouteOptions;
    }

    public void setRouteOptions(List<RouteOption> routeOptions) {
        mRouteOptions = routeOptions;
    }

}
