package com.restapi.employeedept.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.employeedept.dao.empDao;
import com.restapi.employeedept.entity.employee;

@Service
public class empServiceImpl implements empService
{
	@Autowired
	private empDao employeeDao;
	
	public List<employee> getEmployees()
	{
		return (List<employee>)employeeDao.findAll();
	}
	
	public employee getEmployee(int id)
	{
		employee emp = null;
		emp = employeeDao.findById(id);
		return emp;
	}
	
	public void addEmployee(employee emp)
	{
		employeeDao.save(emp);
	}
	
	public void deleteEmployee(int id)
	{
		employeeDao.deleteById(id);
	}
	
	public void updateEmployee(employee emp, int id)
	{
		emp.setId(id);
		employeeDao.save(emp);
	}
}
