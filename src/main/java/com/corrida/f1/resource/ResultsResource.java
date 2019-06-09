package com.corrida.f1.resource;

import com.corrida.f1.dto.ResultsResponse;
import com.corrida.f1.service.ResultsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "Race Result")
@RestController
@RequestMapping(value = "/race-result")
public class ResultsResource {

    @Autowired
    private ResultsService resultadosService;

    @ApiOperation(value = "Returns the result of the F1 race per year and round")
    @GetMapping( value = "/{year}/{round}")
    public ResponseEntity<ResultsResponse> resultRaceToYearAndRound (@PathVariable("year") String year, @PathVariable("round") String round) {
        return new ResponseEntity<>(resultadosService.resultRaceToYearAndRound(year, round), HttpStatus.OK);
    }


}
