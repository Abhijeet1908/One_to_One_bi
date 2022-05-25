package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPersonByPan {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Pan pan = entityManager.find(Pan.class, 1);
		if(pan != null) {
		System.out.println("pan number is " + pan.getPanNumber());
		
	Person person = pan.getPerson();
		System.out.println("person name  is "+person.getName());
		}
		else {
			System.out.println("No pan found");
		}
	}

}
