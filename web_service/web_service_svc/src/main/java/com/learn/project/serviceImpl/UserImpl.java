package com.learn.project.serviceImpl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.project.dao.IUserMapper;
import com.learn.project.service.IUserService;

@Component("userServiceImpl")
public class UserImpl implements IUserService {

    @Autowired
    private IUserMapper userMapper;

    public List<HashMap<String, Object>> findAllUsers() {
        // TODO Auto-generated method stub
        List<HashMap<String, Object>> rs =  userMapper.findAllUsers();
        if(rs!=null && rs.size() >0){
            for(int i=0;i<rs.size() ;i++)
                System.out.println(rs.get(i).toString());
            
        }
        return rs;
    }
    
}
