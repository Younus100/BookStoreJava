import com.bookdstore.entity.Users;
import javax.persistence.*;
import java.sql.SQLIntegrityConstraintViolationException;

public class UserTEst {
    public static void main(String arg[]){
        EntityManagerFactory entityManagerFactory = Persistence.
                createEntityManagerFactory("bookstorewebsite");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Users u = new Users();
        u.setEmail("you@123");
        u.setFullname("Younus");
        u.setPassword("1234");
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(u);
            entityManager.getTransaction().commit();
            entityManagerFactory.close();
            System.out.println("A user object is persisted");
        } catch (Exception e) {
            if (e.getCause() instanceof SQLIntegrityConstraintViolationException) {
                System.out.println("Duplicate entry. Email already exists.");
                // Handle the duplicate email entry here (e.g., inform the user, log, etc.)
            } else {
                // Handle other exceptions
//                e.printStackTrace();
            }
            System.out.println("A user object is not persisted");
        }

    }
}
