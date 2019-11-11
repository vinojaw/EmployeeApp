package com.empapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.empRepository.DepRepo;
import com.empapp.model.Department;
import com.empapp.model.Employee;
import com.empapp.service.EmpServiceImpl;

@RestController
@RequestMapping
public class EmployeeController {
	@Autowired
	private EmpServiceImpl employeeservice;
	@Autowired
	private DepRepo depRepo;

	@GetMapping("/employee")
	public List<Employee> get() {
		return employeeservice.get();
	}

	@PostMapping("/department/{depId}/employee")
	public ResponseEntity<Employee> postEmployee(@RequestBody Employee emp,
			@PathVariable(name="depId") Integer depId) {
		Optional<Department> dep = depRepo.findById(depId);
		if(dep.isPresent()){
			Department d = dep.get();
			emp.setDepartment(d);
			employeeservice.save(emp);
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		}else{
			return new ResponseEntity<Employee>(emp, HttpStatus.NOT_FOUND);
		}
		
		
	}
}
