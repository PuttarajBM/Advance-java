package org.alvas.one_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_one.dto.Adhar;
import org.alvas.one_to_one.dto.Person;

public class PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public Person savePerson(Person person, Adhar adhar) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(adhar);
		entityTransaction.commit();

		return person;
	}

	public Person getPersonAdhar(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		Person person = entityManager.find(Person.class, id);

		return person;
	}

	public Person deletebyID(int id) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, id);

		Adhar adhar = entityManager.find(Adhar.class, person.getAdhar().getId());
		entityTransaction.begin();
		entityManager.remove(person);
		entityManager.remove(adhar);
		entityTransaction.commit();
		return person;
	}
	
	
	public Person UpdatebyId(int id, String name,long adharnum)
	{
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Person person = entityManager.find(Person.class, id);
		person.setName(name);
		
		Adhar adhar = entityManager.find(Adhar.class,person.getAdhar());
		adhar.setAdharnum(adharnum);
		person.setAdhar(adhar);
		entityTransaction.begin();
		entityManager.merge(person);
		entityManager.merge(adhar);
		entityTransaction.commit();
		
		return person;
		
	}
}