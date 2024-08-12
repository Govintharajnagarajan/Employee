package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
EmployeeService es;
	@PostMapping(value="/postEmp")
	public String postThis(@RequestBody Employee e) {
		return es.postThis(e);
	}
	@GetMapping(value="/getList")
	public List<Employee> getList() {
		return es.getlist();
	}
	@GetMapping(value="/getid/{a}")
	public Employee getId(@PathVariable int a) {
		return es.getId(a);
	}
	@GetMapping(value="/getdelete/{a}")
	public String getDelete(@PathVariable int a) {
		return es.getDelete(a);
	}
	
}
