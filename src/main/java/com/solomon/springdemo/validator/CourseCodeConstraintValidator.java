package com.solomon.springdemo.validator;

import com.solomon.springdemo.annotation.CourseCode;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    public String coursePrefix;

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;

        if(s != null){
            result = s.startsWith(coursePrefix);
        }else{
            result = false;
        }

        return result;
    }

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        this.coursePrefix = constraintAnnotation.value();
    }
}
