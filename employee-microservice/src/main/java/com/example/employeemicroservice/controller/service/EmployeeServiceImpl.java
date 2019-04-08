package com.example.employeemicroservice.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.example.employeemicroservice.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	public EmployeeRepository employeeRepository;
	@Autowired
	public MongoTemplate mongoTemplate;

	@Override
	public List<Employee> findAll() {

		return mongoTemplate.findAll(Employee.class);
	}

	@Override
	public Employee findById(String id) {

		return mongoTemplate.findById(id, Employee.class);
	}

	@Override
	public Employee save(Employee employee) {
		return mongoTemplate.save(employee, "employee");
	}

	@Override
	public void deleteById(String id) {
		mongoTemplate.remove(findById(id));

	}

}
