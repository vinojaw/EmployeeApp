package com.empapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.model.Employee;
import com.empapp.service.EmpServiceImpl;

@RestController
@RequestMapping
public class EmployeeController {
	@Autowired
private EmpServiceImpl employeeservice;
	@GetMapping("/employee")
	public List<Employee>get(){
		return employeeservice.get();
	}
	
	@PostMapping("/employee")
	public ResponseEntity<Employee> postEmployee(@RequestBody Employee emp){
		employeeservice.save(emp);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
}
