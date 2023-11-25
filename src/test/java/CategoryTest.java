import com.bookdstore.entity.Category;
import com.bookdstore.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.SQLIntegrityConstraintViolationException;

public class CategoryTest {
    public static void main(String arg[]){
        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("bookstorewebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Category c = new Category();
        c.setName("Science Fiction");
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(c);
            entityManager.getTransaction().commit();
            entityManagerFactory.close();
            System.out.println("A user object is persisted");
        } catch (Exception e) {
            if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
                System.out.println("Duplicate entry. Email already exists.");
                // Handle the duplicate email entry here (e.g., inform the user, log, etc.)
            } else {
                // Handle other exceptions
                e.printStackTrace();
            }
            System.out.println("A user object is not persisted");
        }

    }
}
