package com.learn.project.repository;

import com.learn.project.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Customer, Long> {

}
