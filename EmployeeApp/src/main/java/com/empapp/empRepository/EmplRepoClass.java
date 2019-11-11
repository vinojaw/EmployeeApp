package com.empapp.empRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empapp.model.Department;

@RequestMapping("/department")
@RestController
public class EmplRepoClass {
	
	private DepRepo emplrepo;
	public EmplRepoClass(DepRepo emplrepo) {
		super();
		this.emplrepo = emplrepo;
	}
	@GetMapping
	public List<Department>getDepartment(){
		
		return emplrepo.findAll();
	}

}
