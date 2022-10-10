package com.testapi.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private Long id;
 private String name;
 private String capacity;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCapacity() {
	return capacity;
}
public void setCapacity(String capacity) {
	this.capacity = capacity;
}
public Department(Long id, String name, String capacity) {
	super();
	this.id = id;
	this.name = name;
	this.capacity = capacity;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Department [id=" + id + ", name=" + name + ", capacity=" + capacity + "]";
}
 
}
