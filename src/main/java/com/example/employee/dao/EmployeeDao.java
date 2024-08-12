package com.example.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
@Autowired
EmployeeRepository er;
public String postThis(Employee e) {
	er.save(e);
	return "saving Successfully";
}
public List<Employee> getlist() {
	
	return  er.findAll();
}
public Employee getId(@PathVariable int a) {
	return er.findById(a).get();
}
public String getDelete(@PathVariable int a) {
	er.deleteById(a);

	return "successfully deleted";
}
}
