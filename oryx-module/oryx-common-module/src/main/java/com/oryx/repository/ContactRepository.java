package com.oryx.repository;

import com.oryx.model.system.ref.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface ContactRepository extends PagingAndSortingRepository<Contact, UUID> {
    Page<Contact> findByContactType(Pageable pageable, String contactType);
    Page<Contact> findByValue(Pageable pageable, String value);
}