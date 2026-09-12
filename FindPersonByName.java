package org.jsp.onetooneuni;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByName {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A16");
		EntityManager em=emf.createEntityManager();
		Query q=em.createQuery("select p from Person p where p.name=?1");
		System.out.println("enter the name");
		q.setParameter(1, new Scanner(System.in).next());
		List<Person> p1=q.getResultList();
		if(p1.size()>0) {
			for(Person person:p1) {
				System.out.println(person);
			}
		}
		else {
			System.out.println("No Record found");
		}
		
		
	}

}
