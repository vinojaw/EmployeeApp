package com.empapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empapp.model.Employee;

public interface Employeedao extends JpaRepository<Employee, Integer> {
	

}
