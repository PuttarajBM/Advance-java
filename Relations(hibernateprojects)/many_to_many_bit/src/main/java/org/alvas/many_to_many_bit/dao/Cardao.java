package org.alvas.many_to_many_bit.dao;

import java.awt.Taskbar.Feature;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.many_to_many_bit.dto.Car;

public class Cardao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public List<Car> savecar(List<Car> cars, List<Feature> features) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();

		for (Feature feature : features) {
			entityManager.persist(feature);
		}

		for (Car car : cars) {
			entityManager.persist(car);
		}
		entityTransaction.commit();
		return cars;
	}
}
