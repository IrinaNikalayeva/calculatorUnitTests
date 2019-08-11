package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseTest {

    @Test(dataProvider = "sumTestData", groups = {"smoke", "regression"})
    public void sumDoubleTest(double a, double b, double expected) {
        double actual = calculator.sum(a, b);
        Assert.assertEquals(actual, expected, "Calculation result is not as expected!");
    }

    @DataProvider(name = "sumTestData")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1.1, 2.0, 3.1},
                {5.0, 5.0, 10.0},
                {1.0, -2.0, -1},
                {0, 0, 0},
                {-1, 2.0, 1},
                {-9, -8.5, -17.5}
        };
    }

}
