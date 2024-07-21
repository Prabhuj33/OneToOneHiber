package Controller;

import dao.AadharDao;
import dao.PersonDao;
import dto.Aadhar;
import dto.Person;

public class PersonAadharCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Person p=new Person();
//		p.setId(6);
//		p.setName("Riya");
//		p.setAddress("salem");
//		
//		PersonDao dao=new PersonDao();
//		dao.savePerson(p);
//		
		
//		Aadhar a=new Aadhar();
//		a.setId(105);
//		a.setName("Ramya");
//		a.setAddress("Kochi");
//		
//		AadharDao dao=new AadharDao();
//		dao.SaveAadhar(5, a);
    
		
		
		//update
		
//	Person p= new Person();
//	p.setId(3);
//	p.setName("Vijay");
//	p.setAddress("kanchipuram");
//	
//	PersonDao dao=new PersonDao();
//	dao.updatePerson(3, p);
//	
	
		
		
//		Aadhar a=new Aadhar();
//		a.setId(104);
//		a.setName("Surya");
//		a.setAddress("Delhi");
//		
//		
//		AadharDao dao=new AadharDao();
//		dao.updateAadhar(104, a);
//		
		
//		PersonDao dao =new PersonDao();
//		dao.deletePeron(3);
		
		
		
//		AadharDao dao=new AadharDao();
//		dao.deleteAadhar(103);
		

//		PersonDao dao =new PersonDao();
//		dao.findPerson(4);

		
		AadharDao dao=new AadharDao();
		dao.findAadhar(101);
		
	}
	

}
