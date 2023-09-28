package com.hibernate;

import org.hibernate.*;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		// Hibernate configuration using xml based configuration Method: I
		// Configuration cnfg = new Configuration();
		// cnfg.configure("hibernate.cfg.xml");
		// SessionFactory factory1 = cnfg.buildSessionFactory();
		// System.out.println(factory1);

		// Hibernate configuration using xml based configuration Method: II
		// SessionFactory factory2 = new
		// Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		// System.out.println(factory2);

		// Hibernate configuration with java class file for java based configuration
		SessionFactory factory3 = HibernateUtil.getSessionFactory();
		System.out.println(factory3);
		
		Student st = new Student(007, "Gokku","goku@gmail.com","Male");
		
		Session session = factory3.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		session.close();
		
	}
}
