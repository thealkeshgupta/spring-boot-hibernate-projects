package com.alkeshgupta.springdemo.mvc;

import com.alkeshgupta.springdemo.mvc.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String firstName;

    private String lastName;

    @NotNull(message="is required")
    @Min(value=0, message="must be greater than or equal to zero")
    @Max(value=10, message="must be less than or equal to ten")
    private Integer freePasses;

    @Pattern(regexp="^[a-zA-Z0-9]{6}", message = "must be a valid postal code")
    private String postalCode;

    @CourseCode(value = "AG", message = "must start with AG")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

}
