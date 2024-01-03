package com.hemanth.awscicdpipelinepoc.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDetails {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String mobileNumber;
    private String city;
    private String state;
    private String country;
    private String pinCode;
}
