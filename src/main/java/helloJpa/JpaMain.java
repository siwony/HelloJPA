package helloJpa;

import helloJpa.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaShop");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction(); // JPA에서는 Transaction이라는 단위가 중요하다.
        tx.begin();

        try{

            
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}
