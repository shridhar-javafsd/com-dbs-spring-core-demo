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

		Employee e1;
		e1 = session.get(Employee.class, 201); // select
		session.save(e1);
		System.out.println(e1.toString());
		session.evict(e1);
		e1.setFirstName("Monu");
		session.update(e1); // update
		e1 = session.get(Employee.class, 202);
		System.out.println(e1.toString());
		session.delete(e1); // delete
//		e1 = session.get(Employee.class, 101);
		System.out.println(e1.toString());
		session.close();
		factory.close();
		System.out.println("End");
	}

}
