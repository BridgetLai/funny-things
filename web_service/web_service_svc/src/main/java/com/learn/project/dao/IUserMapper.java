package com.learn.project.dao;

import java.util.HashMap;
import java.util.List;

public interface IUserMapper {
    /**
     * 查找所有的用户
     */
    List<HashMap<String, Object>> findAllUsers();
}
