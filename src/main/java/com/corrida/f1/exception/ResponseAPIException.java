package com.corrida.f1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ResponseAPIException extends RuntimeException{

    public ResponseAPIException(){
        super("API [ergast.com/api/f1] Offline");
    }
}
