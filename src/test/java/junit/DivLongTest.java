package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class DivLongTest extends BaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                {
                        {3, 6, 0},
                        {-12, 5, -2},
                        {-8, -7, 1},
                        {918272L, 45689L, 20}
                });
    }

    private long a;
    private long b;
    private long expected;

    public DivLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void divLongTest() {
        long actual = calculator.div(a, b);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NumberFormatException.class)
    public void testLongDivByZero() {
        calculator.div(4L, 0);
    }
}
