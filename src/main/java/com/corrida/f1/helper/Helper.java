package com.corrida.f1.helper;

import com.corrida.f1.domain.DetData;
import com.corrida.f1.domain.Result;
import com.corrida.f1.dto.ResultsResponse;
import com.corrida.f1.dto.results.DriverResult;

import java.util.List;

public class Helper {

    private static String URL_API_GEN = "https://ergast.com/api/f1/";
    private static String URL_API_SUF = "/results.json";
    private static String BARRA = "/";
    private static String ESPACE = " ";

    public static String getURLResults (String year, String round) {

        String url = URL_API_GEN + year + BARRA + round + URL_API_SUF;
        return url;
    }

    public static ResultsResponse processResultResponse(DetData detData) {

        ResultsResponse resultsResponse = new ResultsResponse();

        resultsResponse.getQueryDetails().setRound(Integer.parseInt(detData.getRaceTable().getRound()));
        resultsResponse.getQueryDetails().setSeason(Integer.parseInt(detData.getRaceTable().getSeason()));
        resultsResponse.getQueryDetails().setSeries(detData.getSeries());

        if (!detData.getRaceTable().getRaces().isEmpty()) {
            resultsResponse.getQueryDetails().setRaceName(detData.getRaceTable().getRaces().get(0).getRaceName());
            resultsResponse.getQueryDetails().setResults(detData.getRaceTable().getRaces().get(0).getResults().size());

            List<Result> resultsList = detData.getRaceTable().getRaces().get(0).getResults();

            for (Result result: resultsList) {

                DriverResult driverResult = new DriverResult();

                driverResult.setPos(Integer.parseInt(result.getPosition()));
                driverResult.setNo(Integer.parseInt(result.getNumber()));
                driverResult.setDriver(result.getDriver().getGivenName() + ESPACE + result.getDriver().getFamilyName());
                driverResult.setConstructor(result.getConstructor().getName());
                driverResult.setLaps(Integer.parseInt(result.getLaps()));
                driverResult.setGrid(Integer.parseInt(result.getGrid()));
                if (result.getTime() != null) {
                    driverResult.setTime(result.getTime().getTime());
                }
                driverResult.setStatus(result.getStatus());
                driverResult.setPoints(Integer.parseInt(result.getPoints()));

                resultsResponse.getRaceResults().add(driverResult);
            }
        }

        return resultsResponse;
    }
}
