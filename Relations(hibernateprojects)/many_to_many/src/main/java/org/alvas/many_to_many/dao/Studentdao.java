package org.alvas.many_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.security.auth.Subject;

import org.alvas.many_to_many.dto.Student;

public class Studentdao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager;
	EntityTransaction entityTransaction;
	
	public Student savestudent(Student student,Student student1,List<Subject> list)
	{
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityManager.persist(student1);
		for (Subject subject : list)
		{
			entityManager.persist(subject);
		}
		entityTransaction.commit();
		return student;
	}
}

