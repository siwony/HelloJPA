package relationshipManage_05;

import relationshipManage_05.entity.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RelationshipManageMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaShop");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction(); // JPA에서는 Transaction이라는 단위가 중요하다.
        tx.begin();

        try{
            Book book = new Book();
            book.setName("표준 JPA");
            book.setAuthor("김영한");

            em.persist(book);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }

        emf.close();
    }
}