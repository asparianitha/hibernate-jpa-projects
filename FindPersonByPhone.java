package org.jsp.onetooneuni;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindPersonByPhone {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("A16");
        EntityManager em = emf.createEntityManager();

        Query q = em.createQuery("select p from Person p where p.phone=?1");

        System.out.println("enter the phone");
        q.setParameter(1, new Scanner(System.in).nextLong());

        try {
            Person p = (Person) q.getSingleResult(); // changed to getSingleResult
            System.out.println(p);
        } catch (NoResultException e) {
            System.out.println("No Record found");
        }

        em.close();
        emf.close();
    }
}
