package dbDrivenDesign_01;

import dbDrivenDesign_01.entity.Order;
import dbDrivenDesign_01.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DbDrivenDesignMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaShop");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction(); // JPA에서는 Transaction이라는 단위가 중요하다.
        tx.begin();

        try{

            Order order = em.find(Order.class, 1L); // Order 를 조회하여
            Long memberId = order.getMemberId(); // Member 의 Id 값을 알아내

            Member member = em.find(Member.class, memberId); // 다시 member 를 조회한다. 뭔가 이상하다. 객체지향 스럽지 않다.

            
            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}
