package org.jsp.onetooneuni;
import java.util.Scanner;
import javax.persistence.*;

public class FindPanCardByPanNoAndDob {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("A16");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("select p from PanCard p where p.panNo=?1 and p.dob=?2");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter panNo");
        q.setParameter(1, sc.next());
        System.out.println("enter dob");
        q.setParameter(2, sc.next()); // if dob is LocalDate use LocalDate.parse(sc.next())
        try {
            PanCard pc = (PanCard) q.getSingleResult();
            System.out.println(pc);
        } catch(NoResultException e) { System.out.println("No Record found"); }
        em.close(); emf.close();
    }
}
