package com.example.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;

@Service
public class EmployeeService {
@Autowired
EmployeeDao ed;
public String postThis(Employee e) {
	return ed.postThis(e);
}
public List<Employee> getlist() {
	return  ed.getlist();
}
public Employee getId(@PathVariable int a) {
	return ed.getId(a);
}
public String getDelete(@PathVariable int a) {
	return ed.getDelete(a);
}
}
