package com.javatut.connection;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppMain {

	public static void main(String[] args) {
		System.out.println("Project Started");
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		
		//Creating Teacher
		Teacher t = new Teacher(102, "Ali", "Lucknow");
		
		//Creating Address
		Address ad = new Address();
		ad.setStreet("Street1");
		ad.setCity("New Delhi");
		ad.setOpen(true);
		ad.setAddedDate(new Date());
		ad.setX(1234.25);
				
		
		Session session = factory.openSession();
		Transaction tx =  session.beginTransaction();
		session.save(t);
		session.save(ad);
		tx.commit();
		
		
		session.close();
		System.out.println("Record saved");
	}

}
