package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SinTest extends BaseTest {

    @Parameterized.Parameters
    public static Collection<Object[]> sinTestData() {
        return Arrays.asList(new Object[][]
                {
                        {Math.toRadians(90), 1},
                        {Math.toRadians(0), 0},
                        {Math.toRadians(30), 0.5},
                });
    }

    private double a;
    private double expected;

    public SinTest(double a, double expected) {
        this.a = a;
        this.expected = expected;
    }

    @Test
    public void testLongSin() {
        double sin = calculator.sin(a);
        Assert.assertEquals(expected, sin, 1E-6);
    }
}
