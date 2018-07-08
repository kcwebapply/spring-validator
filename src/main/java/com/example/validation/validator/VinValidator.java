package com.example.validation.validator;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target({ElementType.FIELD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = VinValidatorImpl.class)
public @interface VinValidator {

    public int min = 17;
    public int max = 17;

    int max() default max;
    int min() default min;

    String message() default "{vin is not corrected}";

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
