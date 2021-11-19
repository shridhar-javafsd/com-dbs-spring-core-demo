package com.dbs.demo.hb;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dbs.demo.Employee;

public class HibernateDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		Configuration config = new Configuration();
		SessionFactory factory = config.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Employee emp = new Employee(501, "Sonu", 45678.9);
		session.save(emp);
		
		transaction.commit();

		System.out.println("End");
	}

}
