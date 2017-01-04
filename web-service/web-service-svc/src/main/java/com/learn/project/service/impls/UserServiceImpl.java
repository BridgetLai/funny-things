package com.learn.project.service.impls;

import com.learn.project.dao.IUserMapper;
import com.learn.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component("userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("");
        }
    }

    public List<HashMap<String, Object>> findAllUsers() {
        // TODO Auto-generated method stub
        List<HashMap<String, Object>> rs = userMapper.findAllUsers();
        if (rs != null && rs.size() > 0) {
            for (int i = 0; i < rs.size(); i++)
                System.out.println(rs.get(i).toString());

        }
        return rs;
    }

}
