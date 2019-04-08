package com.example.employeemicroservice.controller.service;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemicroservice.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
