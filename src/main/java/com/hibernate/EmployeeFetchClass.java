package com.hibernate;

import org.hibernate.*;

public class EmployeeFetchClass {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		Employee emp = session.load(Employee.class, 1);
		System.out.println(emp.toString());
		
	}

}
