package org.jsp.onetooneuni;

import javax.persistence.*;
import java.util.List;

public class FindPancardByPersonPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("A16");
		EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("select p.card from Person p where p.phone=?1");
		q.setParameter(1, 1234567890L);
		
		List<PanCard> list = q.getResultList();
		if(list.isEmpty()) {
			System.out.println("No person found with this phone. Check DB.");
		} else {
			for(PanCard card : list) {
				System.out.println(card);
			}
		}
	}
}