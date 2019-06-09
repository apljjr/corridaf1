package com.corrida.f1.repository.impl;

import com.corrida.f1.domain.Data;
import com.corrida.f1.domain.DetData;
import com.corrida.f1.exception.ResponseAPIException;
import com.corrida.f1.repository.ResultsRepository;
import com.corrida.f1.helper.Helper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class ResultsRepositoryImpl implements ResultsRepository {

    @Override
    public DetData resultRaceToYearAndRound(String year, String round) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String url = Helper.getURLResults(year, round);
            ResponseEntity<Data> dataAPI = restTemplate.getForEntity(url, Data.class);
            return dataAPI.getBody().getData();
        } catch (ResponseAPIException e) {
             throw e;
        }
    }
}
