package org.jsp.onetooneuni;
import java.util.Scanner;
import javax.persistence.*;

public class FindPanCardById {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("A16");
        EntityManager em = emf.createEntityManager();
        System.out.println("enter pancard id");
        int id = new Scanner(System.in).nextInt();
        PanCard pc = em.find(PanCard.class, id);
        if(pc!=null) System.out.println(pc);
        else System.out.println("No Record found");
        em.close(); emf.close();
    }
}
