package com.dbs.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

// Annotation based configuration 

@ComponentScan
public class App2 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App2.class);

		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());

		Customer cust = context.getBean(Customer.class);
		System.out.println(cust.toString());

		((AbstractApplicationContext) context).close();

	}

}
