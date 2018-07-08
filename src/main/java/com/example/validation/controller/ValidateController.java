package com.example.validation.controller;


import com.example.validation.validator.VinValidator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@Validated
public class ValidateController {

    @RequestMapping(value = "/validate/{vin}",method = RequestMethod.GET)
    public String getValidate(@PathVariable @VinValidator String vin){
        return vin;
    }


    @RequestMapping(value = "/validate/post",method = RequestMethod.POST)
    public RequestVinResource postValidate(@RequestBody @Valid RequestVinResource requestVinResource){
        System.out.println(requestVinResource.getVin());
        return requestVinResource;
    }

}
