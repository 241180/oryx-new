package com.oryx.service;

import com.oryx.model.system.ose.AssoUserToken;
import com.oryx.repository.AssoUserTokenRepository;
import com.oryx.repository.UserRepository;
import com.oryx.vo.UserListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class AssoUserTokenService {

    @Autowired
    private AssoUserTokenRepository assoUserTokenRepository;

    @Transactional(readOnly = true)
    public AssoUserToken findByUserId(UUID userId){
        return assoUserTokenRepository.findByUserId(userId);
    }

    @Transactional(readOnly = true)
    public AssoUserToken findByToken(String token){
        return assoUserTokenRepository.findByToken(token);
    }

    public void save(AssoUserToken assoUserToken) {
        assoUserTokenRepository.save(assoUserToken);
    }

    public void delete(UUID id) {
        assoUserTokenRepository.deleteById(id);
    }
}