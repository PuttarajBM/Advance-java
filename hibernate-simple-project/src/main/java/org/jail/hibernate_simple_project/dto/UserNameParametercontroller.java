package org.jail.hibernate_simple_project.dto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserNameParametercontroller {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String query="SELECT u FROM User u where u.name=:name";
		Query query2=entityManager.createQuery(query);
		query2.setParameter("name","nanu");
		List<User> list=query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+"\n"+a.getName()+"\n"+a.getEmail()));


	}
}
