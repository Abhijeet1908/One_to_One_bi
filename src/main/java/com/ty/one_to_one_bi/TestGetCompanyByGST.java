package com.ty.one_to_one_bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompanyByGST {
	public static void main(String[] args) {
		
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	
	GST gst = entityManager.find(GST.class , 1);
	
	if(gst != null) {
		System.out.println("Gst number is "+gst.getGstNumber());
		
		Company company = gst.getCompany();
		
		System.out.println("And the company name is "+company.getName());
	}

}
}