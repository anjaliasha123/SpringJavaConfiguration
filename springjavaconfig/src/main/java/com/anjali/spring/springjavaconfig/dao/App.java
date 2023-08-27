package com.anjali.spring.springjavaconfig.dao;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anjali.spring.springjavaconfig.AppConfiguration;
import com.anjali.spring.springjavaconfig.services.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Service s = context.getBean(Service.class);
        s.save();
    }
}
