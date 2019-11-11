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

import com.empapp.empRepository.DepRepo;
import com.empapp.model.Department;
@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepRepo deprepo;
		@GetMapping("/")
		public List<Department>get(){
			return deprepo.findAll();
		}
			@PostMapping("/")
			public ResponseEntity<Department>postDepartment(@RequestBody Department dep){
				deprepo.save(dep);
				return new ResponseEntity<Department>(dep, HttpStatus.OK);

	
		} 

}
