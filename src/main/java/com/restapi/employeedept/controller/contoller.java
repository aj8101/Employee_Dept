package com.restapi.employeedept.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.employeedept.entity.employee;
import com.restapi.employeedept.service.empService;

@RestController
public class contoller 
{
	@Autowired
	private empService service;
	
	@GetMapping("/employee")
	public List<employee> getEmployees()
	{
		return service.getEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public employee getEmployee(@PathVariable int id)
	{
		return service.getEmployee(id);
	}
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody employee emp)
	{
		service.addEmployee(emp);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		service.deleteEmployee(id);
	}
	
	@PutMapping("/employee/{id}")
	public void updateEmployee(@RequestBody employee emp, @PathVariable int id)
	{
		service.updateEmployee(emp, id);
	}
	
}
