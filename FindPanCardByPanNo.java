package org.jsp.onetooneuni;
import java.util.Scanner;
import javax.persistence.*;

public class FindPanCardByPanNo {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("A16");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select p from PanCard p where p.panNo=?1");
        System.out.println("enter panNo");
        q.setParameter(1, new Scanner(System.in).next());
        try {
            PanCard pc = (PanCard) q.getSingleResult();
            System.out.println(pc);
        } catch(NoResultException e) { System.out.println("No Record found"); }
        em.close(); emf.close();
    }
}
