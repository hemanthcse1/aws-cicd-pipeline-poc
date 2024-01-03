package com.hemanth.awscicdpipelinepoc.exceptionhandler.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = org.springframework.http.HttpStatus.BAD_REQUEST, reason = "Method argument not valid")
public class MethodArgumentNotValidException extends RuntimeException{
    public MethodArgumentNotValidException(String message) {
        super(message);
    }
}

