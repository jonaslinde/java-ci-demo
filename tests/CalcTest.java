import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CalcTest {

    @Test
    public void test1Test() {
	assertTrue(1 == 1);
    }

    @Test
    public void test2Test() {
	assertTrue(1 == 1 + 1);
    }

    @Test
    public void test3Test() {
	assertTrue(1 != 2);
    }
}
