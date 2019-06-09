package com.corrida.f1.repository;

import com.corrida.f1.domain.DetData;

public interface ResultsRepository {

    DetData resultRaceToYearAndRound (String year, String round);
}
