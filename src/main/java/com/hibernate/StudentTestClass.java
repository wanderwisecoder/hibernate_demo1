package com.hibernate;



import org.hibernate.*;

public class StudentTestClass {

	public static void main(String[] args) {

		// Hibernate configuration with java class file for java based configuration

		SessionFactory factory = HibernateUtil.getSessionFactory();

		System.out.println(factory);

		Student st = new Student(007, "Gokku", "goku@gmail.com", "Male");

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();

	}
}