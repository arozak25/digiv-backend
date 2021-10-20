package com.digiv.backend.repository;

import com.digiv.backend.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
