package org.jsp.onetooneuni;
import java.util.Scanner;

import javax.persistence.*;

public class FindPanCardByPersonId {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("A16");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select p.card from Person p where p.id=?1");
        System.out.println("enter person id");
        q.setParameter(1, new Scanner(System.in).nextInt());
        try {
            PanCard pc = (PanCard) q.getSingleResult();
            System.out.println(pc);
        } catch(NoResultException e) { System.out.println("No Record found"); }
        em.close(); emf.close();
    }
}
