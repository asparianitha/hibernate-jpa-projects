package org.jsp.onetooneuni;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A16");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		PanCard card=new PanCard();
		card.setPanNo("AMGS0383Z");
		card.setDob("14-7-2001");
		
		Person p=new Person();
		p.setName("Bhanu");
		p.setPhone(1902475690);
		p.setCard(card);
		
		
		em.persist(p);
		em.persist(card);
		et.commit();

	}

}
	
	
	
	
    
    
	
	
	


