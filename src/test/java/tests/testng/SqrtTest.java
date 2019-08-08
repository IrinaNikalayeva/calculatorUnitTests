package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTest extends BaseTest {

    @Test(dataProvider = "dataForDouble")
    public void SqrtTest(double a, double resultSqrt) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, resultSqrt, "wrong");
    }

    @DataProvider(name = "dataForDouble")
    public Object[][] doubleValues() {
        return new Object[][]{
            {1, 1},
            {4, 2},
            {6.25, 2.5}
        };
    }
}
