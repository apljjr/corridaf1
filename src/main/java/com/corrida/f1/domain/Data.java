package com.corrida.f1.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Data implements Serializable {

    @JsonProperty("MRData")
    private DetData data;

    public Data() {
    }

    public DetData getData() {
        return data;
    }

    public void setData(DetData data) {
        this.data = data;
    }
}
