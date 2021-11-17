package com.dbs.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	// IoC  
	// DI 

	public static void main(String[] args) {

		System.out.println("Start");

//		Employee obj = new Employee();

//		Employee obj = new Employee2();

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		Employee obj = new Employee();
//		Employee obj = ejb.getInstance();		
		Employee obj = context.getBean("emp", Employee.class);
//		Employee obj = context.getBean("emp2", Employee.class);

		obj.work();

		System.out.println("End");
	}
}
