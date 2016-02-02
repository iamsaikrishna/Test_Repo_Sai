package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
				
		Employee emp=(Employee) context.getBean("emp");
		
		System.out.println(emp.getEmpid()+" "+emp.getEmpname()+" "+emp.getSalary());
		
		System.out.println(emp.getAddress().getStreetname()+" "+emp.getAddress().getCity()+" "+emp.getAddress().getPincode()+" "+emp.getAddress().getState());
		
		
		
	}

}
