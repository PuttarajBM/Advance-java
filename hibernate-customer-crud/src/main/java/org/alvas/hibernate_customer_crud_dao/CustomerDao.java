 package org.alvas.hibernate_customer_crud_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.alvas.hibernate_customer_crud_dto.Customer;
//import org.jail.hibernate_simple_project.dto.User;

public class CustomerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public Customer saveCustomer(Customer customer) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		if (customer != null) {
			entityTransaction.begin();
			entityManager.persist(customer);
			entityTransaction.commit();
			System.out.println("*************data sorted*********");
		} else {
			System.out.println("**********please set data in customer object");
		}
		return customer;
	}

	public Customer updateById(int id, String name, String mail) {
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Customer customer1 = entityManager.find(Customer.class, id);
		customer1.setName(name);
		customer1.setEmail(mail);
		if (customer1 != null) {
			entityTransaction.begin();
			entityManager.merge(customer1);
			entityTransaction.commit();
			System.out.println("*******Data upadated*******");
		} else {
			System.out.println("*******please set the data in customer object*");

		}
		return customer1;
	}
	
	
	
	public Customer deleteById(int id)
	{
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		Customer customer = entityManager.find(Customer.class, id);
		if(customer!=null)
		{
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("***please check the data in customer");
		}
		return customer;
		
	}
	
	public Customer displayAll(Customer customer)
	{
	
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
		String query="SELECT c FROM Customer c";
		Query query2=entityManager.createQuery(query);
		List<Customer> list=query2.getResultList();
		list.forEach(a->System.out.println(a.getId()+"\n"+a.getName()+"\n"+a.getEmail()));
		return customer;
	}
}
