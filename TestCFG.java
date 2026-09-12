package org.jsp.onetooneuni;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class TestCFG {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("A16");
		System.out.println(emf);
		
		
	}

}
