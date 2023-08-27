package com.anjali.spring.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.anjali.spring.springjavaconfig.dao.Dao;
import com.anjali.spring.springjavaconfig.dao.DaoConfig;
import com.anjali.spring.springjavaconfig.services.Service;

@Configuration
@Import(DaoConfig.class)
public class AppConfiguration {
	
	
	@Bean
	public Service service() {
		return new Service();
	}
}
