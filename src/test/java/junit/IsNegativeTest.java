package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IsNegativeTest extends BaseTest {

    private long a;
    private boolean expected;

    public IsNegativeTest(long a, boolean expected) {
        this.a = a;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]
                                 {
                                     {0, false},
                                     {-5, true},
                                     {7, false},
                                     });
    }

    @Test
    public void isNegative() {
        boolean actual = calculator.isNegative(a);
        Assert.assertEquals(actual, expected);
    }


}
