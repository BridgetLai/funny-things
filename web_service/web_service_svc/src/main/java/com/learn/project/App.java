package com.learn.project;

import java.util.concurrent.CountDownLatch;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.project.service.IUserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CountDownLatch begin = new CountDownLatch(1);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
        context.start();
        IUserService service = (IUserService) context.getBean("userServiceImpl");
        System.out.println(service.findAllUsers());
        
    }
}
