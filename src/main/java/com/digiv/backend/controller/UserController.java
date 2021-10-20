package com.digiv.backend.controller;

import com.digiv.backend.model.CreateUserRequest;
import com.digiv.backend.model.WebResponse;
import com.digiv.backend.model.response.service.CreateUserServiceResponse;
import com.digiv.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public WebResponse<CreateUserServiceResponse> createUser(@RequestBody CreateUserRequest request){

        CreateUserServiceResponse response = userService.create(request);

        return WebResponse.<CreateUserServiceResponse>builder()
                .code(HttpStatus.OK.value())
                .status(HttpStatus.OK.name())
                .data(response)
                .build();
    }
}
