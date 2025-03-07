package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivDoubleTest extends BaseTest {

    @Test(dataProvider = "divTestData", groups = {"smoke", "regression"})
    public void divDoubleTest(double a, double b, double expectedDouble) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedDouble, "wrong value!");
    }

    @DataProvider(name = "divTestData")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1.1, 2.1, 0.5238095238095238},
                {5.0, 5.0, 1},
                {1.0, -2.0, -0.5},
                {1, 5, 0.2},
        };
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "extended")
    public void divideByZero() {
        calculator.div(2, 0);
    }
}
