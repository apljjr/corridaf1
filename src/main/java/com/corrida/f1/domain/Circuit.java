package com.corrida.f1.domain;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Circuit implements Serializable {

    private String circuitId;
    private String url;
    private String circuitName;
    @JsonProperty("Location")
    private Location location;

    public String getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCircuitName() {
        return circuitName;
    }

    public void setCircuitName(String circuitName) {
        this.circuitName = circuitName;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
