package com.digiv.backend.controller;

import com.digiv.backend.entity.User;
import com.digiv.backend.model.CreateUserRequest;
import com.digiv.backend.model.WebResponse;
import com.digiv.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public WebResponse createUser(CreateUserRequest request){

        User response = userService.create(request);

        return WebResponse.<User>builder()
                .code(HttpStatus.OK.value())
                .status(HttpStatus.OK.name())
                .data(response)
                .build();
    }
}
