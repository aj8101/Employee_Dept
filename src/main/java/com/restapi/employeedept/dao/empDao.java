package com.restapi.employeedept.dao;

import org.springframework.data.repository.CrudRepository;

import com.restapi.employeedept.entity.employee;

public interface empDao extends CrudRepository<employee, Integer>{
	public employee findById(int id);
}