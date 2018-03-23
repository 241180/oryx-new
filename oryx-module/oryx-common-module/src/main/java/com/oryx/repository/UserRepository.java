package com.oryx.repository;

import org.springframework.data.repository.CrudRepository;
import com.oryx.model.IUser;

public interface UserRepository extends CrudRepository<IUser, Integer> {
    IUser findByEmail(String email);
}
