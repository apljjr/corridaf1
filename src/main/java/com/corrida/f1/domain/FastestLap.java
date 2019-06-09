package com.corrida.f1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FastestLap {

    private String rack;
    private String lap;
    @JsonProperty("Time")
    private Time time;
    @JsonProperty("AverageSpeed")
    private AverageSpeed averageSpeed;

    public String getRack() {
        return rack;
    }

    public void setRack(String rack) {
        this.rack = rack;
    }

    public String getLap() {
        return lap;
    }

    public void setLap(String lap) {
        this.lap = lap;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public AverageSpeed getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(AverageSpeed averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
}
