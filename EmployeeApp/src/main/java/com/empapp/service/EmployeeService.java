package com.empapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empapp.dao.DaoEmp;
import com.empapp.dao.Employeedao;
import com.empapp.model.Employee;
@Service
public class EmployeeService implements EmpServiceImpl{
//	@Autowired
//	private DaoEmp daoemp;
	@Autowired
	Employeedao employeedao;
	public List<Employee> get() {
		// TODO Auto-generated method stub
	return employeedao.findAll();
		
	}
	
	public Employee get(int id) {
		return employeedao.getOne(id);
	}
	
	public Employee save(Employee employee) {
		return employeedao.save(employee);
		
	}
	
	public void delete(int id) {
		employeedao.deleteById(id);
	}
	
}
