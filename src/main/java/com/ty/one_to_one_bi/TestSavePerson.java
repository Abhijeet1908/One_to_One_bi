package com.ty.one_to_one_bi;



	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.EntityTransaction;
	import javax.persistence.Persistence;

	public class TestSavePerson {
		public static void main(String[] args) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			Person person = new Person();
			person.setName("Legain");
			person.setEmail("lee@gmail.com");
			person.setPhone(78502588);
			
			Pan pan = new Pan();
			pan.setAddress("Burtuk");
			pan.setPanNumber("BRIN004545");
			
			person.setPan(pan);
			pan.setPerson(person);
			
			entityTransaction.begin();
			
			entityManager.persist(person);
			
			entityManager.persist(pan);
			
			entityTransaction.commit();
			
			System.out.println("Pan and person created sucessfully");
			
		}

	

	

}
