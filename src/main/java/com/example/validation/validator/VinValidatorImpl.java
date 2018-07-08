package com.example.validation.validator;

import com.example.validation.model.VinRepository;
import com.example.validation.model.VinTable;
import lombok.RequiredArgsConstructor;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Optional;


@RequiredArgsConstructor
public class VinValidatorImpl implements ConstraintValidator<VinValidator,String > {

    private int min;

    private int max;

    private final VinRepository vinRepository;

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
        Optional<VinTable> entity = vinRepository.findById(value);
        if(!entity.isPresent()){
            throw new VinExistenceException("VinValidationError","Vin is not exist");
        }
        return true;
    }
}
