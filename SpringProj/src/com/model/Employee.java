package com.model;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private int empid;
	private String empname;
	private String salary;
	
	//@Resource
	
	private Address address;
	
	public Employee()
	{
		
	}
	//@Autowired

	public Employee(Address addr)
	{
		this.address=addr;
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	
	
	

}
