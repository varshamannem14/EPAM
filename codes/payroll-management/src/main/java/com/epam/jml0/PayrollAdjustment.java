package com.epam.jml0;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PayrollAdjustment {
    String adjustmentType();
    double adjustmentRate() default 0.0;
}


