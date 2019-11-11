package com.empapp.empRepository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import com.empapp.model.Department;

public interface DepRepo extends JpaRepository<Department, Integer>{

	

}
