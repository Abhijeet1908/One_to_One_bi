package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPanByPerson {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 5);
		if(person != null) {
		System.out.println("person name is " + person.getName());
		
		Pan pan = person.getPan();
		System.out.println("person pan number  is "+pan.getPanNumber());
		}
		else {
			System.out.println("No person found");
		}
	}
}