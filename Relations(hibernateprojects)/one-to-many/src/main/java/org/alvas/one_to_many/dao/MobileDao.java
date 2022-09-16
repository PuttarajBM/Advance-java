package org.alvas.one_to_many.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.alvas.one_to_many.dto.Mobile;
import org.alvas.one_to_many.dto.Sim;

public class MobileDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ansari");
	EntityManager entityManager;
	EntityTransaction entityTransaction;

	public Mobile saveMobileSim(Mobile mobile, List<Sim> sim) {
		entityTransaction.begin();
		entityManager.persist(mobile);
		entityManager.persist(sim);
		entityTransaction.commit();
		return mobile;
		
	}
		
		
		
		
		
		
		
		public Mobile updateMobileById(int id,String simname,String mobilename)
		{
			entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction=entityManager.getTransaction();
			  Mobile mobile2 = entityManager.find(Mobile.class, id);
			  
			  entityTransaction.begin();
			  List <Sim> sims =mobile2.getList();
			  
			  for(Sim sim : sims)
			  {
				  if(sim.getName().equals("jio"))
				  {
					  sim.setId(id);
				  }
			  }
		}
		
		
		
		public Mobile deletethedetails() {
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			
			Mobile mobile = entityManager.find(Mobile.class, id);
			EntityTransaction.begin();
			
			mobile.setName(mobilename);
			
			List<Sim> list = mobile.getList();
			
			for(Sim sim : list)
			{
				if(sim.getName().equals("tata-docomo")) {
					sim.setName(simname);
					entityManager.merge(sim);
					
				}
			}
			entityManager.merge(mobile);
			entityTransaction.commit();
		}
	
}
