package com.ufba.matc84.chamadaappback.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class ObjectAlreadyExistsException extends RuntimeException {

    public ObjectAlreadyExistsException(String message){
        super(message);
    }

    public ObjectAlreadyExistsException(String message, Throwable cause){
        super(message, cause);
    }
}