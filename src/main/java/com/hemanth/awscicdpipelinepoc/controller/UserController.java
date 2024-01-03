package com.hemanth.awscicdpipelinepoc.controller;

import com.hemanth.awscicdpipelinepoc.model.CreateUserRequest;
import com.hemanth.awscicdpipelinepoc.services.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<?> createUser(@Valid CreateUserRequest createUserRequest) {
        return userService.createUser(createUserRequest);
    }
}
