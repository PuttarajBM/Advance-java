package org.alvas.many_to_one.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.many_to_one.dto.Building;
import org.alvas.many_to_one.dto.College;

public class Collegedao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	public Building saveBuildingCollege(College college,Building building,Building building2)
	{
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
//		entityManager.persist(college);
		entityManager.persist(building);
		entityManager.persist(building2);
		entityTransaction.commit();
		return building2;
	}
	
}
