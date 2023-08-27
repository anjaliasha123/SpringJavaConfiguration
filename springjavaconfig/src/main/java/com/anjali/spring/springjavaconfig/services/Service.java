package com.anjali.spring.springjavaconfig.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.anjali.spring.springjavaconfig.dao.Dao;

public class Service {
	@Autowired
	private Dao dao;
	public void save() {
		dao.create();
	}
}
