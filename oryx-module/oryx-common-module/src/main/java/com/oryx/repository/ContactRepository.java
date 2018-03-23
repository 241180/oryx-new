package com.oryx.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.oryx.model.IContact;

public interface ContactRepository extends PagingAndSortingRepository<IContact, Integer> {
    Page<IContact> findByNameLike(Pageable pageable, String name);
}