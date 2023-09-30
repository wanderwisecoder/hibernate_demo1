package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeTestClass {
	
	public static void main(String[] args) 
	{

		// Hibernate configuration with java class file for java based configuration

		SessionFactory factory = HibernateUtil.getSessionFactory();

		System.out.println(factory);

		Employee ep = new Employee("Gohan", 3729239.2939, new Date(), "gohan@gmail.com", true, "vgjhbh");

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(ep);
		tx.commit();
		session.close();

	}
 }