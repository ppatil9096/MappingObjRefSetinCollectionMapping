package com.pravin.hibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
	Session session = new Configuration().configure()
		.buildSessionFactory()
		.openSession();

	Transaction transaction = session.beginTransaction();

	Answer answer = new Answer();
	answer.setGivenAnswer("Mahableshwar");
	answer.setSubmittedBy("Amit");

	Answer answer2 = new Answer();
	answer2.setGivenAnswer("Bangkok");
	answer2.setSubmittedBy("Avinash");
	
	Set<Answer> answers = new HashSet<>();
	answers.add(answer);
	answers.add(answer2);

	Question question = new Question();
	question.setQuestin("Whats your best tour point?");
	question.setAnswers(answers);

	session.persist(question);
	transaction.commit();
	session.close();
	System.out.println("Success!");
    }
}
