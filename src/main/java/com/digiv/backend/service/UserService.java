package com.digiv.backend.service;

import com.digiv.backend.entity.User;
import com.digiv.backend.model.CreateUserRequest;
import com.digiv.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.Date;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
@Service
@Validated
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User create(@Valid CreateUserRequest request){
        User user = User.builder()
                .email(request.getEmail())
                .fullName(request.getFullName())
                .password(request.getPassword())
                .creationTime(new Date().getTime())
                .build();

        userRepository.save(user);

        return user;
    }
}
