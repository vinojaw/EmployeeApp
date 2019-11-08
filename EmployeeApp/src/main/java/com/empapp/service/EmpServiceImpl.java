package com.empapp.service;

import java.util.List;

import com.empapp.model.Employee;

public interface EmpServiceImpl {
	List<Employee>get();
	Employee get(int id);
	Employee save(Employee employee);
	void delete(int id);
	
}
