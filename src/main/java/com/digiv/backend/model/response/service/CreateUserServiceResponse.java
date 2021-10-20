package com.digiv.backend.model.response.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * @author Abdul Rozak
 * @since 20/10/21
 */
@Builder
@AllArgsConstructor
@Data
public class CreateUserServiceResponse {

    Long id;

    String email;

    String fullName;

}
