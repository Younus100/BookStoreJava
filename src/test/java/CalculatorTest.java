import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("hhhhhh");
    }

    @Test
    public void addTest() {
        Calculator c  = new Calculator();
        int v = c.add(1,2);
        assert v==3;
    }
}
