package com.javatut.connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		System.out.println("Project Started");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		
		Teacher t = new Teacher();
		t.setId(103);
		t.setName("Raj");
		t.setCity("New Delhi");
		
		Certificate cer = new Certificate();
		cer.setCourse("Java Programming");
		cer.setDuration("10 Months");
		
		t.setCertificate(cer);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(t);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Record saved");
	}

}
