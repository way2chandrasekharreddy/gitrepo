package com.example.employeemicroservice.controller.service;

import java.util.List;
import java.util.Optional;

import com.example.employeemicroservice.model.Employee;

public interface EmployeeService {

	public List<Employee> findAll();

	public Employee findById(String id);

	public Employee save(Employee employee);

	public void deleteById(String id);

}
