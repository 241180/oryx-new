package com.oryx.repository;

import com.oryx.model.system.ose.Codification;
import com.oryx.model.system.ref.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface CodificationRepository extends PagingAndSortingRepository<Codification, UUID> {
    Codification findByServerCodeAndInternalCode(String serverCode, String internalCode);
    Codification findByServerCodeAndExternalCode(String serverCode, String externalCode);
}