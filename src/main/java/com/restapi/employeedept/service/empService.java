package com.restapi.employeedept.service;

import java.util.List;

import com.restapi.employeedept.entity.employee;


public interface empService 
{
	public List<employee> getEmployees();
	
	public employee getEmployee(int id);
	
	public void addEmployee(employee emp);
	
	public void deleteEmployee(int id);
	
	public void updateEmployee(employee emp, int id);
}
