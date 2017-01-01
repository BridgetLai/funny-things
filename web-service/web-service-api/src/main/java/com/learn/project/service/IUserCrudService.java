package com.learn.project.service;

import com.learn.project.model.User;

/**
 * 用户crud Service, 执行crud操作
 */
public interface IUserCrudService {
    User create(User user);

    User findById(Long id);

    User update(User user);

    void delete(Long id);
}
