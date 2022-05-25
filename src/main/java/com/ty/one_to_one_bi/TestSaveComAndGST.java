package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveComAndGST {
			public static void main(String[] args) {
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				EntityTransaction entityTransaction = entityManager.getTransaction();
				
				Company company = new Company();
				company.setName("EndWall");
				company.setPhone(78945662);
				company.setWeb("www.EndwallDefenceTech.com");
				
				
				GST gst = new GST();
				gst.setGstNumber("GSTIN00001234");
				gst.setState("Gujarat");
				gst.setCountry("India");
				gst.setCompany(company);
				company.setGst(gst);
				
				
				entityTransaction.begin();
				
				entityManager.persist(gst);
				entityManager.persist(company);
				
				entityTransaction.commit();
				
				System.out.println("Company registered sucessfully");
				
			}

		



}
