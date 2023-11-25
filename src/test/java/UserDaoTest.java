import com.bookdstore.dao.UserDao;
import com.bookdstore.entity.Users;
import org.junit.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDaoTest {
    private static EntityManagerFactory entityManagerFactory;
    private static EntityManager entityManager;
    private static Users test;
    @BeforeClass
    public static void beforeClass() throws Exception {
        entityManagerFactory = Persistence.createEntityManagerFactory("bookstorewebsite");
        entityManager= entityManagerFactory.createEntityManager();
        test = new Users();
        test.setPassword("123345678");
        test.setFullname("Test2Test");
        test.setEmail("abcd@12345678");
    }
    @Before
    public void setUp() throws Exception {

    }
//    @Test
//    public void testcreteUser(){
//        UserDao userDao =new UserDao(entityManager);
////        userDao.create(test);
//    }

    @Test
    public void testupdateUssr(){
        UserDao userDao = new UserDao(entityManager);
        test.setUserID(14);
        userDao.update(test);
    }

    @After
    public void tearDown() throws Exception {

    }

    @AfterClass
    public static void afterClass() throws Exception {
         entityManager.close();
         entityManagerFactory.close();
    }
}
