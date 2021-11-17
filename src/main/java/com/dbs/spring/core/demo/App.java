package com.dbs.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//XML based configuration 


public class App {

	// IoC
	// DI

	public static void main(String[] args) {

		System.out.println("Start");

//		Employee obj = new Employee();

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee obj = context.getBean("emp", Employee.class);
		System.out.println(obj.toString());

		Employee obj2 = context.getBean("emp2", Employee.class);
		System.out.println(obj2.toString());

		System.out.println("End");

		((AbstractApplicationContext) context).close();

	}
}
