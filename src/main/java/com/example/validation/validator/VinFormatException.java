package com.example.validation.validator;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class VinFormatException extends RuntimeException{

    private String detailMessage;


    public VinFormatException(String message,String detailMessage){
        super(message);
        this.detailMessage = detailMessage;
    }


}
