package com.dbs.demo.jp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dbs.demo.Employee;

public class JpaDemo {

	public static void main(String[] args) {

		System.out.println("Start...");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("abcd");

		EntityManager em = factory.createEntityManager();

		em.getTransaction().begin();

		Employee emp = new Employee(601, "Sonu", 123456.78);
		em.persist(emp);

		System.out.println("End");

	}

}
