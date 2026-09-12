package org.jsp.onetooneuni;

import javax.persistence.*;

public class FindPersonByPancardId {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("A16");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p from Person p where p.card.id=?1");
		q.setParameter(1, 1);
		
		Person person = (Person) q.getSingleResult();
		System.out.println(person.getId() + " " + person.getName() + " " + person.getPhone());
		System.out.println(person.getCard());
	}
}
