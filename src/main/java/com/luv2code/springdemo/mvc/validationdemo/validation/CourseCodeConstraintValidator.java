package com.luv2code.springdemo.mvc.validationdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }

    @Override
    public boolean isValid(String thecode, ConstraintValidatorContext constraintValidatorContext) {
        boolean result;
        if (thecode != null)
            result = thecode.startsWith(coursePrefix);
        else result = true;

        return result;
    }
}
