package tests.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubDoubleTest extends BaseTest {

    @Test(dataProvider = "dataDouble", groups = "positive")
    public void SubDoubleTest(double a, double b, double expectedDouble) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedDouble, "wrong");
    }

    @DataProvider(name = "dataDouble")
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
