package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTest extends BaseTest {

    @Test(dataProvider = "dataForDouble")
    public void PowDoubleTest(double a, double b, double resultD) {
        double reslut = calculator.pow(a, b);
        Assert.assertEquals(reslut, resultD, "The result is rounded! Error in method implementation!");

    }

    @DataProvider(name = "dataForDouble")
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
