package com.learn.project;

import com.learn.project.service.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CountDownLatch;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        CountDownLatch begin = new CountDownLatch(1);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring*.xml");
        context.start();
        IUserService service = (IUserService) context.getBean("userServiceImpl");
        System.out.println(service.findAllUsers());

    }
}
