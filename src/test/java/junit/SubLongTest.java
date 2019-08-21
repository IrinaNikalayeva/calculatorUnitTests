package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SubLongTest extends BaseTest {

    private long a;
    private long b;
    private long expected;

    public SubLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                                 {
                                     {3, 6, -3},
                                     {-12, 5, -17},
                                     {-8, -7, -1},
                                     {918272, 45689, 872583}
                                 });
    }

    @Test
    public void testLongMult() {
        long actual = calculator.sub(a, b);
        Assert.assertEquals(expected, actual);
    }
}
