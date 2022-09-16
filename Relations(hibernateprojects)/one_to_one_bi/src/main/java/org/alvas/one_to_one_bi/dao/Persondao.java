package org.alvas.one_to_one_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_one_bi.dto.Pen;
import org.alvas.one_to_one_bi.dto.Person;

public class Persondao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	public Person saveperson(Person person,Pen pan)
	{
		entityManager= entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(pan);
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}
}
