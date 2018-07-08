package com.example.validation.errorAdvisor;


import com.example.validation.validator.VinFormatException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.xml.ws.Response;

@ControllerAdvice
public class ExceptionHandlerAdvisor {

    @ExceptionHandler(VinFormatException.class)
    public ResponseEntity<ErrorResponse> handleVinException(VinFormatException e){
        ErrorResponse response = new ErrorResponse();
        response.setCode(HttpStatus.BAD_REQUEST.toString());
        response.setMessage(e.getMessage());
        response.setDetail(e.getDetailMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
