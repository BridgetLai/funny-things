package com.learn.project.service;

import com.learn.project.model.User;
import com.learn.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserCrudService implements IUserCrudService {

    @Autowired
    private UserRepository repository;

    public User create(User user) {
        Date date = new Date();
        user.setCreateTime(date);
        user.setUpdateTime(date);
        user.setDelete(false);
        return repository.save(user);
    }

    public User findById(Long id) {
        return repository.findOne(id);
    }

    public User update(User user) {
        user.setUpdateTime(new Date());
        return repository.save(user);
    }

    public void delete(Long id) {
        User user = repository.findOne(id);
        user.setUpdateTime(new Date());
        user.setDelete(true);
        repository.save(user);
    }
}
