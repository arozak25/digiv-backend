package com.digiv.backend.repository;

import com.digiv.backend.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Abdul Rozak
 * @since 19/10/21
 */
public interface UserRepository extends CrudRepository<User, Long> {

    void delete(User deleted);

    List<User> findAll();

    User save(User user);
}
