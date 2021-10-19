package com.digiv.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
@Builder
@AllArgsConstructor
@Data
public class CreateUserRequest {

    @Email
    String email;

    @NotBlank
    String fullName;

    @NotBlank
    String password;
}
