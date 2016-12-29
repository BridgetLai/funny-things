package com.learn.project.dao;

import java.util.HashMap;
import java.util.List;

import com.learn.project.model.User;

public interface IUserMapper {
    /**
     * 查找所有的用户
     */
public List<HashMap<String, Object>> findAllUsers();
}
