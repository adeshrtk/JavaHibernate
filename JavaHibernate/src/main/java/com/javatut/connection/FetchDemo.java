package com.javatut.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// get and load methods
		System.out.println("Project Started");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		
		Session session = factory.openSession();
		
		//get address:1
		Address ad = (Address) session.get(Address.class, 2);
		System.out.println(ad);
		
		session.close();
		factory.close();
	}

}
