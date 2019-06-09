package com.corrida.f1.service.impl;

import com.corrida.f1.domain.DetData;
import com.corrida.f1.dto.ResultsResponse;
import com.corrida.f1.helper.Helper;
import com.corrida.f1.repository.ResultsRepository;
import com.corrida.f1.service.ResultsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultsServiceImpl implements ResultsService {

    @Autowired
    private ResultsRepository resultadosRepository;

    @Override
    public ResultsResponse resultRaceToYearAndRound(String year, String round) {
        DetData detData =  resultadosRepository.resultRaceToYearAndRound(year, round);
        ResultsResponse resultsResponse = Helper.processResultResponse(detData);
        return resultsResponse;
    }
}
