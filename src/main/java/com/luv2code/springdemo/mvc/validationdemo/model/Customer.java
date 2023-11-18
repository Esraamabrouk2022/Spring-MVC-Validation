package com.luv2code.springdemo.mvc.validationdemo.model;

import com.luv2code.springdemo.mvc.validationdemo.validation.CourseCode;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName = "";

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater than 0")
    @Max(value = 10, message = "must be less than 10")
    private Integer freepasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 char or digits")
    private String postelCode;

    @CourseCode
    private String courseCode;

}
