package com.testapi.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapi.demo.entity.Department;
import com.testapi.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceimpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}
	
	@Override
	public void deleteDepartmentById(Long departmentId) {
		
		 departmentRepository.deleteById(departmentId);
	}

	@Override
	public List<Department> findAll() {	
	return (List<Department>) departmentRepository.findAll();
	}


	@Override
	public Department updateDepartment(Department department, Long deptId) {
		Department deptDb = departmentRepository.findById(deptId).get();
		System.out.println(deptDb);
		
	    if(Objects.nonNull(department.getName())&& !"".equalsIgnoreCase(department.getName())) {
	    	
	    	deptDb.setName(department.getName());
	    }
	    
	    if(Objects.nonNull(department.getCapacity()) && !"".equalsIgnoreCase(department.getCapacity())) {
	    	deptDb.setCapacity(department.getCapacity());
	    }

		
		return departmentRepository.save(deptDb);
	}

	
	

 
	@Override
	public Department updateDepartment() {
		// TODO Auto-generated method stub
		return null;
	}
	}
