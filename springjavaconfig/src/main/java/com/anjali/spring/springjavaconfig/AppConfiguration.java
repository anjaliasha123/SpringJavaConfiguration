package com.anjali.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anjali.spring.springjavaconfig.dao.Dao;
import com.anjali.spring.springjavaconfig.services.Service;

@Configuration
public class AppConfiguration {
	
	@Bean
	public Dao dao() {
		return new Dao();
	}
	@Bean
	public Service service() {
		return new Service();
	}
}
