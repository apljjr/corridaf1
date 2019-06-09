package com.corrida.f1.dto;

import com.corrida.f1.dto.results.DriverResult;
import com.corrida.f1.dto.results.QueryDetails;

import java.util.ArrayList;
import java.util.List;

public class ResultsResponse {

    private QueryDetails queryDetails;
    private List<DriverResult> raceResults;

    public ResultsResponse() {
        this.queryDetails = new QueryDetails();
        this.raceResults =  new ArrayList<DriverResult>();
    }

    public QueryDetails getQueryDetails() {
        return queryDetails;
    }

    public void setQueryDetails(QueryDetails queryDetails) {
        this.queryDetails = queryDetails;
    }

    public List<DriverResult> getRaceResults() {
        return raceResults;
    }

    public void setRaceResults(List<DriverResult> raceResults) {
        this.raceResults = raceResults;
    }
}
