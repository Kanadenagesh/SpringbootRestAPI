package com.testapi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testapi.demo.entity.Department;
import com.testapi.demo.service.DepartmentService;
@RestController
public class DepartmentController {
    @Autowired
	private DepartmentService departmentService;
	@PostMapping("/departments")
	public Department SaveDepartment(@RequestBody Department dept) {
		return departmentService.saveDepartment(dept);
	}
	@DeleteMapping("/departments/{id}")
	public String deleteById(@PathVariable("id") Long deptId) {
	 
		departmentService.deleteDepartmentById(deptId);
		return("Deleted Succesfully");
	}
	@GetMapping("/getlist")
	public List<Department> getAllDpet(){
		
		
		return(List<Department>) departmentService.findAll();
	}
	
	@PutMapping("/update/{id}")
	public Department updateDepartment(@RequestBody Department department,@PathVariable("id") Long deptId) {
		return departmentService.updateDepartment(department,deptId);
	}
}
