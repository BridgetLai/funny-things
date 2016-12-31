package com.learn.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.learn.project.model.User;

public interface UserRepository  extends CrudRepository<User, Long>{

}
