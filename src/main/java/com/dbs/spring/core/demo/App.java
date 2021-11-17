package com.dbs.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

//		Employee obj = new Employee();

		ApplicationContext context = new ClassPathXmlApplicationContext();

		Employee obj = context.getBean(Employee.class);

		obj.work();

		System.out.println("End");
	}
}
