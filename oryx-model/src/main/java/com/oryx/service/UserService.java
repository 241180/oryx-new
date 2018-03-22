package com.oryx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.oryx.model.IUser;
import com.oryx.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public IUser findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
