package com.javatut.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("Project Started");		

		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		
		Teacher t = new Teacher(102, "Ali", "Lucknow");
		
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		session.save(t);
		tx.commit();
		
		session.close();
		System.out.println("Record saved");
	}

}
