package com.example.validation.errorAdvisor;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorResponse {

    private String code;
    private String message;
    private String detail;
}
