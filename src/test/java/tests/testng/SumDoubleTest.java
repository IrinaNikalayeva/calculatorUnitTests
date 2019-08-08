package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleTest extends BaseTest {

    @Test(dataProvider = "dataDouble", groups = "positive")
    public void SumDoubleTest(double a, double b, double expectedDouble) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedDouble, "Calculation result is not as expected!");
    }

    @DataProvider(name = "dataDouble")
    public Object[][] doubleValues() {
        return new Object[][] {
            {1.1, 2.0, 3.1},
            {5.0, 5.0, 10.0},
            {1.0, -2.0, -1},
            {0, 0, 0},
            {-1, 2.0, 1},
            {-9, -8.5, -17.5}
        };
    }

}
