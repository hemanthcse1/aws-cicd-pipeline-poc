package com.hemanth.awscicdpipelinepoc.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateUserRequest {

    @NotBlank(message = "First name is mandatory")
    private String firstName;

    @NotBlank(message = "Last name is mandatory")
    private String lastName;

    @NotBlank(message = "Email is mandatory")
    private String email;

    @NotBlank(message = "Date of Birth is mandatory")
    private String dateOfBirth;

    @NotBlank(message = "Mobile number is mandatory")
    private String mobileNumber;

    @NotBlank(message = "City is mandatory")
    private String city;

    @NotBlank(message = "State is mandatory")
    private String state;

    @NotBlank(message = "Country is mandatory")
    private String country;

    @NotBlank(message = "Pin code is mandatory")
    private String pinCode;

}
