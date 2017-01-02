package com.learn.project.service;

import com.learn.project.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-data-jpa.xml", "classpath:spring-data-source.xml"})
public class UserCrudServiceTest {

    @Autowired
    private IUserCrudService userCrudService;

    @Test
    public void testCreate() throws Exception {
        User user = new User();
        user.setUserName("sb");
        user.setEmail("sb@sb.com");
        user.setPassword("sbpwd");
        System.out.println(userCrudService.create(user) + "--------");
    }


    @Test
    public void testFindById() throws Exception {
        System.out.println(userCrudService.findById(1L) + "--------");
    }


    @Test
    public void testUpdate() throws Exception {
        User user = userCrudService.findById(1L);
        Date date = new Date();
        user.setUpdateUser(date.getTime() + "");
        System.out.println(date.getTime());
        System.out.println(userCrudService.update(user) + "--------");
    }


    @Test
    public void testDelete() throws Exception {
        userCrudService.delete(1L);
        System.out.println(userCrudService.findById(1L).getDelete().equals(true) + "--------");

    }


} 
