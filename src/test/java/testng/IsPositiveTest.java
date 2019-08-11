package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseTest {
    @Test(dataProvider = "testData", groups = "regression")
    public void isPositive(long val, boolean expected) {
        boolean actual = calculator.isPositive(val);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] testData() {
        return new Object[][]{
                {1, true},
                {5, true},
                {0, false},
                {-60, false},
                {-15, false},
        };
    }
}
