package com.oryx.service;

import com.oryx.model.IUser;
import com.oryx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public IUser findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
