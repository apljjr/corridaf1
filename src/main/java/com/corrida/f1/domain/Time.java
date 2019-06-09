package com.corrida.f1.domain;

import java.io.Serializable;

public class Time implements Serializable {

    private String millis;
    private String time;

    public Time() {
        this.millis = "";
        this.time = "";
    }

    public String getMillis() {
        return millis;
    }

    public void setMillis(String millis) {
        this.millis = millis;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
