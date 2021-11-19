package com.dbs.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		DriverManagerDataSource ds = context.getBean("dataSource", DriverManagerDataSource.class);

		JdbcTemplate jt = new JdbcTemplate(ds);

		int result = jt.update("update emp_table set salary = salary + 10000");

		System.out.println(result);

		((AbstractApplicationContext) context).close();

		System.out.println("End");

	}

}
