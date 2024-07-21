package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Aadhar;
import dto.Person;

public class AadharDao {


	public void SaveAadhar(int personId,Aadhar aadhar)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		
		Person dbPerson=em.find(Person.class,personId);
		
		if(dbPerson!=null)
		{
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(aadhar);
			
			dbPerson.setAadhar(aadhar);
			et.commit();
			
		}
		else 
		{
			System.out.println("sorry id is not present");
		}
		
		}
	
	
	
	
	public void updateAadhar(int id,Aadhar aadhar)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		
		Aadhar dbAadhar=em.find(Aadhar.class,id);
		
		if(dbAadhar!=null)
		{
			EntityTransaction et=em.getTransaction();
			et.begin();
			
			aadhar.setId(id);
			em.merge(aadhar);
			
		
			et.commit();
			
		}
		else 
		{
			System.out.println("sorry id is not present");
		}
		
	
	}
	
	
	public void deleteAadhar(int id) {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
	  EntityManager em=emf.createEntityManager();
	  EntityTransaction et=em.getTransaction();
	  
	  Aadhar dbAadhar=em.find(Aadhar.class, id);
	  
	  if(dbAadhar!=null)
	  {
		  et.begin();
		  em.remove(dbAadhar);
		  et.commit();
	  }
	  else 
	  {
		  System.out.println("soory id is not present");
	  }
	
	}


	public void findAadhar(int id) {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		  EntityManager em=emf.createEntityManager();
		  EntityTransaction et=em.getTransaction();
		  
		  Aadhar dbAadhar=em.find(Aadhar.class, id);
		  
		  if(dbAadhar!=null)
		  {
			  System.out.println(dbAadhar);
		  }
		  else 
		  {
			  System.out.println("soory id is not present");
		  }
		
		}



}

