package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseTest {

    @Test(dataProvider = "powTestData", groups = {"extended", "regression"})
    public void powDoubleTest(double a, double b, double expected) {
        double actual = calculator.pow(a, b);
        Assert.assertEquals(actual, expected, "The result is rounded! Error in method implementation!");

    }

    @DataProvider(name = "powTestData")
    public Object[][] doubleValues() {
        return new Object[][]{
            {1, 2, 1},
            {5, 2, 25},
            {1, -2, 1},
            {0, 0, 1},
            {2, 1.1, 2.14354693},
            };
    }
}
