package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Person;

public class PersonDao
{

	public void savePerson(Person person)
	{
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		em.persist(person);
		et.commit();
	}


public void updatePerson(int id, Person person)
{

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	Person dbPerson=em.find(Person.class,id);
	if(dbPerson!=null)
	{
		et.begin();
		person.setId(id);
		person.setAadhar(dbPerson.getAadhar());
		em.merge(person);
		et.commit();
	}
	else {
		System.out.println("soory id is not present");
	}

}



public void deletePeron(int id)
{
  EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
  EntityManager em=emf.createEntityManager();
  EntityTransaction et=em.getTransaction();
  
  Person dbPerson=em.find(Person.class, id);
  
  if(dbPerson!=null)
  {
	  et.begin();
	  em.remove(dbPerson);
	  et.commit();
  }
  else 
  {
	  System.out.println("soory id is not present");
  }
}

public void findPerson(int id)
{
	
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("prabhu");
	  EntityManager em=emf.createEntityManager();
	  EntityTransaction et=em.getTransaction();
	  
	  Person dbPerson=em.find(Person.class, id);
	  
	  if(dbPerson!=null)
	  {
		  System.out.println(dbPerson);
	  }
	  else 
	  {
		  System.out.println("soory id is not present");
	  }
	
	}
}
