package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultDoubleTest extends BaseTest {

    @Test(dataProvider = "dataForDouble")
    public void multDoubleTest(double a, double b, double expectedDouble) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedDouble, "Operation error: result was rounded!");
    }

    @DataProvider(name = "dataForDouble")
    public Object[][] doubleValues() {
        return new Object[][]{
            {1.1, 2.1, 2.31},
            {5.0, 5.0, 25},
            {1.0, -2.0, -2},
            {0, 0, 0},
            {1, 5, 5},
            };
    }
}
