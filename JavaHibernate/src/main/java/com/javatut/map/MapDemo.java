package com.javatut.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		System.out.println("Project Started");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(factory);
		
		Question q1 = new Question();
		q1.setQuestionId(2);
		q1.setQuestion("What is Java?");
		
		Answer ans = new Answer();
		ans.setAnswerId(2);
		ans.setAnswer("Java is programming language");
		
		q1.setAnswer(ans);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		session.save(ans);
		
		tx.commit();
		
		//Fetch question
		Question newQ = (Question)session.get(Question.class, 1);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAnswer());
		
		session.close();
		factory.close();
		
		System.out.println("Record Saved Successfully");

	}

}
