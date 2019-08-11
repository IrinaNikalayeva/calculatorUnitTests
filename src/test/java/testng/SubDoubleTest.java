package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseTest {

    @Test(dataProvider = "subTestData", groups = {"smoke", "regression"})
    public void subDoubleTest(double a, double b, double expected) {
        double actual = calculator.sub(a, b);
        Assert.assertEquals(actual, expected, "Calculation result is not as expected!");
    }

    @DataProvider(name = "subTestData")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1.0, 2.0, -1},
                {5.0, 5.0, 0},
                {1.0, -2.0, 3},
                {0, 0, 0},
                {1, 5, -4},
        };
    }
}
