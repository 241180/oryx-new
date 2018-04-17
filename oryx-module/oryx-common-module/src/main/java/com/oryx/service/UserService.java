package com.oryx.service;

import com.oryx.model.system.ose.User;
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
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public User findByLogin(String login){
        return userRepository.findByLogin(login);
    }

    @Transactional(readOnly = true)
    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }


    @Transactional(readOnly = true)
    public UserListVO findAll(int page, int maxResults) {
        Page<User> result = executeQueryFindAll(page, maxResults);

        if (shouldExecuteSameQueryInLastPage(page, result)) {
            int lastPage = result.getTotalPages() - 1;
            result = executeQueryFindAll(lastPage, maxResults);
        }

        return buildResult(result);
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void delete(UUID userId) {
        userRepository.deleteById(userId);
    }

    @Transactional(readOnly = true)
    public UserListVO findByEmail(int page, int maxResults, String email) {
        Page<User> result = executeQueryFindByEmail(page, maxResults, email);

        if (shouldExecuteSameQueryInLastPage(page, result)) {
            int lastPage = result.getTotalPages() - 1;
            result = executeQueryFindByEmail(lastPage, maxResults, email);
        }

        return buildResult(result);
    }

    private boolean shouldExecuteSameQueryInLastPage(int page, Page<User> result) {
        return isUserAfterOrOnLastPage(page, result) && hasDataInDataBase(result);
    }

    private Page<User> executeQueryFindAll(int page, int maxResults) {
        final PageRequest pageRequest = new PageRequest(page, maxResults, sortByEmailASC());

        return userRepository.findAll(pageRequest);
    }

    private Sort sortByEmailASC() {
        return new Sort(Sort.Direction.ASC, "code");
    }

    private UserListVO buildResult(Page<User> result) {
        return new UserListVO(result.getTotalPages(), result.getTotalElements(), result.getContent());
    }

    private Page<User> executeQueryFindByEmail(int page, int maxResults, String email) {
        final PageRequest pageRequest = new PageRequest(page, maxResults, sortByEmailASC());

        return userRepository.findByEmail(pageRequest, "%" + email + "%");
    }

    private boolean isUserAfterOrOnLastPage(int page, Page<User> result) {
        return page >= result.getTotalPages() - 1;
    }

    private boolean hasDataInDataBase(Page<User> result) {
        return result.getTotalElements() > 0;
    }
}