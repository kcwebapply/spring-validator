package com.example.validation.validator;

import org.omg.CORBA.portable.ApplicationException;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class VinValidatorImpl implements ConstraintValidator<VinValidator,String > {

    private int min;

    private int max;


    @Override
    public void initialize(VinValidator constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        final int length = value.length();
        if(length < min || length > max){
            throw new VinFormatException("VinValidationError","Vin size is not 17");
        }
        return true;
    }
}
