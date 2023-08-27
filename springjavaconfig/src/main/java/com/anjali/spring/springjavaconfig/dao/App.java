package com.anjali.spring.springjavaconfig.dao;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.anjali.spring.springjavaconfig.AppConfiguration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        Dao d = context.getBean(Dao.class);
        d.create();
    }
}
