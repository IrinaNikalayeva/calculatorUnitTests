package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultLongTest extends BaseTest {

    private long a;
    private long b;
    private long expected;

    public MultLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                                 {
                                     {3, 6, 18},
                                     {-12, 5, -60},
                                     {-8, -7, 56},
                                     {918272L, 45689L, 41954929408L}
                                 });
    }

    @Test
    public void testLongMult() {
        long actual = calculator.mult(a, b);
        Assert.assertEquals(expected, actual);
    }
}
