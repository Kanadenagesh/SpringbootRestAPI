package com.testapi.demo.service;

import java.util.List;

import com.testapi.demo.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department department);
	
	public void deleteDepartmentById(Long departmentId);
	
	public List<Department> findAll();
	
	public Department updateDepartment();

	Department updateDepartment(Department department, Long deptId);

}
