package com.oryx.service;

import com.oryx.model.IContact;
import com.oryx.repository.ContactRepository;
import com.oryx.vo.ContactListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Transactional(readOnly = true)
    public ContactListVO findAll(int page, int maxResults) {
        Page<IContact> result = executeQueryFindAll(page, maxResults);

        if (shouldExecuteSameQueryInLastPage(page, result)) {
            int lastPage = result.getTotalPages() - 1;
            result = executeQueryFindAll(lastPage, maxResults);
        }

        return buildResult(result);
    }

    public void save(IContact contact) {
        contactRepository.save(contact);
    }

    public void delete(int contactId) {
        contactRepository.deleteById(contactId);
    }

    @Transactional(readOnly = true)
    public ContactListVO findByNameLike(int page, int maxResults, String name) {
        Page<IContact> result = executeQueryFindByName(page, maxResults, name);

        if (shouldExecuteSameQueryInLastPage(page, result)) {
            int lastPage = result.getTotalPages() - 1;
            result = executeQueryFindByName(lastPage, maxResults, name);
        }

        return buildResult(result);
    }

    private boolean shouldExecuteSameQueryInLastPage(int page, Page<IContact> result) {
        return isUserAfterOrOnLastPage(page, result) && hasDataInDataBase(result);
    }

    private Page<IContact> executeQueryFindAll(int page, int maxResults) {
        final PageRequest pageRequest = new PageRequest(page, maxResults, sortByNameASC());

        return contactRepository.findAll(pageRequest);
    }

    private Sort sortByNameASC() {
        return new Sort(Sort.Direction.ASC, "name");
    }

    private ContactListVO buildResult(Page<IContact> result) {
        return new ContactListVO(result.getTotalPages(), result.getTotalElements(), result.getContent());
    }

    private Page<IContact> executeQueryFindByName(int page, int maxResults, String name) {
        final PageRequest pageRequest = new PageRequest(page, maxResults, sortByNameASC());

        return contactRepository.findByNameLike(pageRequest, "%" + name + "%");
    }

    private boolean isUserAfterOrOnLastPage(int page, Page<IContact> result) {
        return page >= result.getTotalPages() - 1;
    }

    private boolean hasDataInDataBase(Page<IContact> result) {
        return result.getTotalElements() > 0;
    }
}