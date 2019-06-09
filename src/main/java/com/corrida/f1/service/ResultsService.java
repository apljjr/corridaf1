package com.corrida.f1.service;

import com.corrida.f1.dto.ResultsResponse;

public interface ResultsService {

    ResultsResponse resultRaceToYearAndRound(String year, String round);

}
