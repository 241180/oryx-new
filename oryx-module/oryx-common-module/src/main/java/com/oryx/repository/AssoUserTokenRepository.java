package com.oryx.repository;

import com.oryx.model.system.ose.AssoUserToken;
import com.oryx.model.system.ose.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface AssoUserTokenRepository extends PagingAndSortingRepository<AssoUserToken, UUID> {
    AssoUserToken findByUserId(UUID userId);
    AssoUserToken findByToken(String token);
}
