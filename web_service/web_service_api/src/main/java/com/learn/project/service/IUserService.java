package com.learn.project.service;

import java.util.HashMap;
import java.util.List;

public interface IUserService {
    /**
     * 查找所有的用户
     */
    List<HashMap<String, Object>> findAllUsers();
}
