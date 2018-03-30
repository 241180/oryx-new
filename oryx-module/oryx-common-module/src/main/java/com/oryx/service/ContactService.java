package com.oryx.service;

import com.oryx.model.system.ref.Contact;
import com.oryx.repository.ContactRepository;
import com.oryx.vo.ContactListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Transactional(readOnly = true)
    public ContactListVO findAll(int page, int maxResults) {
        Page<Contact> result = executeQueryFindAll(page, maxResults);

        if (shouldExecuteSameQueryInLastPage(page, result)) {
            int lastPage = result.getTotalPages() - 1;
            result = executeQueryFindAll(lastPage, maxResults);
        }

        return buildResult(result);
    }

    public void save(Contact contact) {
        contactRepository.save(contact);
    }

    public void delete(UUID contactId) {
        contactRepository.deleteById(contactId);
    }

    @Transactional(readOnly = true)
    public ContactListVO findByContactType(int page, int maxResults, String contactType) {
        Page<Contact> result = executeQueryFindByContactType(page, maxResults, contactType);

        if (shouldExecuteSameQueryInLastPage(page, result)) {
            int lastPage = result.getTotalPages() - 1;
            result = executeQueryFindByContactType(lastPage, maxResults, contactType);
        }

        return buildResult(result);
    }

    private boolean shouldExecuteSameQueryInLastPage(int page, Page<Contact> result) {
        return isUserAfterOrOnLastPage(page, result) && hasDataInDataBase(result);
    }

    private Page<Contact> executeQueryFindAll(int page, int maxResults) {
        final PageRequest pageRequest = new PageRequest(page, maxResults, sortByContactTypeASC());

        return contactRepository.findAll(pageRequest);
    }

    private Sort sortByContactTypeASC() {
        return new Sort(Sort.Direction.ASC, "contactType");
    }

    private ContactListVO buildResult(Page<Contact> result) {
        return new ContactListVO(result.getTotalPages(), result.getTotalElements(), result.getContent());
    }

    private Page<Contact> executeQueryFindByContactType(int page, int maxResults, String name) {
        final PageRequest pageRequest = new PageRequest(page, maxResults, sortByContactTypeASC());

        return contactRepository.findByContactType(pageRequest, "%" + name + "%");
    }

    private boolean isUserAfterOrOnLastPage(int page, Page<Contact> result) {
        return page >= result.getTotalPages() - 1;
    }

    private boolean hasDataInDataBase(Page<Contact> result) {
        return result.getTotalElements() > 0;
    }
}