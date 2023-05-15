package com.twinkles.voterightproducerservice.exceptions;

import lombok.Getter;

@Getter
public class SimpoProjectException extends RuntimeException{
    private final int statusCode;
    public SimpoProjectException(String message, int statusCode){
        super(message);
        this.statusCode = statusCode;
    }
}
