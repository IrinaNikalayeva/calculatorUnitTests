package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SumLongTest extends BaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                {
                        {3, 6, 9},
                        {-12, 5, -7},
                        {-8, -7, -15},
                        {918272, 45689, 963961}
                });
    }

    private long a;
    private long b;
    private long expected;

    public SumLongTest(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void sumLongTest() {
        long actual = calculator.sum(a, b);
        Assert.assertEquals(expected, actual);
    }
}
