package com.oryx.repository;

import org.springframework.data.repository.CrudRepository;
import com.oryx.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}
