package com.example.employeemicroservice.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemicroservice.controller.service.EmployeeService;
import com.example.employeemicroservice.model.Employee;

@RestController
@RequestMapping(path = "/api/v1/employees")
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;

	@GetMapping
	public ResponseEntity<List<Employee>> findAll() {
		return ResponseEntity.ok(employeeService.findAll());
	}

	@SuppressWarnings("rawtypes")
	@PostMapping
	public ResponseEntity create(@Valid @RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.save(employee));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> findById(@PathVariable String id) {
		Employee stock = employeeService.findById(id);
		if (stock == null) {
			System.out.println("Id " + id + " is not existed");
			ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(stock);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> update(@PathVariable String id, @Valid @RequestBody Employee employee) {
		if (employeeService.findById(id) == null) {
			System.out.println("Id " + id + " is not existed");
			ResponseEntity.badRequest().build();
		}

		return ResponseEntity.ok(employeeService.save(employee));
	}

	@SuppressWarnings("rawtypes")
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable String id) {
		if (employeeService.findById(id) == null) {
			System.out.println("Id " + id + " is not existed");
			ResponseEntity.badRequest().build();
		}

		employeeService.deleteById(id);

		return ResponseEntity.ok().build();
	}

}
