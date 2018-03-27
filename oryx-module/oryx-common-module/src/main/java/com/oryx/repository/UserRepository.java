package com.oryx.repository;

import com.oryx.model.system.ose.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Integer> {
    Page<User> findByEmail(Pageable pageable, String email);
}
