package com.oryx.repository;

import com.oryx.model.IUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<IUser, Integer> {
    IUser findByEmail(String email);
}
