package com.example.validation.validator;


import lombok.Data;
import org.omg.CORBA.portable.ApplicationException;

@Data
public class VinExistenceException extends RuntimeException {
    private String detailMessage;


    public VinExistenceException(String message,String detailMessage){
        super(message);
        this.detailMessage = detailMessage;
    }
}
