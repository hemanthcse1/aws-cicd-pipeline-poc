package com.hemanth.awscicdpipelinepoc.services;

import com.hemanth.awscicdpipelinepoc.exceptionhandler.exceptions.MethodArgumentNotValidException;
import com.hemanth.awscicdpipelinepoc.model.CreateUserRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;

@Service
public class UserService {

    private final Validator validator;

    public UserService(Validator validator) {
        this.validator = validator;
    }

    public ResponseEntity<?> createUser(CreateUserRequest createUserRequest) {
        ResponseEntity<?> responseEntity = null;

        BindingResult bindingResult = new BeanPropertyBindingResult(createUserRequest, "CreateUserRequest");

        validator.validate(createUserRequest, bindingResult);

        if (bindingResult.hasErrors()) {
            throw new MethodArgumentNotValidException(bindingResult.getAllErrors().stream().findFirst().get().getDefaultMessage());
        }


        return null;
    }
}
