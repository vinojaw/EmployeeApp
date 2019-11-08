package com.empapp.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.empapp.model.Employee;
@Repository
public class DaoEmp {
//	@Autowired
//	private DaoEmp daoemp;
//	@Autowired
//private	EntityManager entityManager;
//
//	public List<Employee> get() {
//		// TODO Auto-generated method stub
//		Session currentSession=entityManager.unwrap(org.hibernate.Session.class);
//				 Query<Employee>query =currentSession.createQuery("from Employee,Employee.class");
//				List<Employee> list=query.getResultList();
//				return list;
//	
//	}
//
//	public Employee get(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void save(Employee employee) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void delete(int id) {
//		// TODO Auto-generated method stub
//		
//	}

}
