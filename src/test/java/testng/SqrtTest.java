package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest {

    @Test(dataProvider = "sqrtTestData", groups = {"extended", "regression"})
    public void sqrtTest(double a, double expected) {
        double actual = calculator.sqrt(a);
        Assert.assertEquals(actual, expected, "Calculation result is not as expected!");
    }

    @DataProvider(name = "sqrtTestData")
    public Object[][] doubleValues() {
        return new Object[][]{
            {1, 1},
            {4, 2},
            {6.25, 2.5}
        };
    }
}
