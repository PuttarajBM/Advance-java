package org.jail.hibernate_simple_project.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		User user = entityManager.find(User.class, 102);

		user.setName("nanu");

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		System.out.print("userid=" + user.getId() + " updated");
	}

}
