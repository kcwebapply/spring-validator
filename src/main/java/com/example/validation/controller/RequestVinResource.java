package com.example.validation.controller;


import com.example.validation.validator.VinValidator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RequestVinResource implements Serializable {

    @VinValidator
    private String vin;
}
