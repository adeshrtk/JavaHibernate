package com.javatut.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		// get() and load() methods
		System.out.println("Project Started");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		
		Session session = factory.openSession();
		
		//get address when object exists
		Address ad = (Address) session.get(Address.class, 2);
		System.out.println(ad.getStreet());
		
		Address ad5 = (Address) session.get(Address.class, 3);
		System.out.println(ad5.getStreet());
		
		//get address when object does not exists. get() will return null
		Address ad1 = (Address) session.get(Address.class, 5);
		System.out.println(ad1);
		
//		//load address when object exists
		Address ad3 = (Address) session.load(Address.class, 2);
		System.out.println(ad3);
		
		//load address when object doen't exist. It will throw ObjectNotFound error
//		Address ad4 = (Address)session.load(Address.class, 5);
//		System.out.println(ad4);
		
		session.close();
		factory.close();
		
		System.out.println("Record Fetched Successfully");
	}

}
