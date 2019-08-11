package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTest extends BaseTest {

    @Test (dataProvider = "cosTestData", groups = {"extended", "regression"})
    public void cosTest(double a, double expected) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, expected);
    }


    @DataProvider(name = "cosTestData")
    public Object[][] doubleValues() {
        return new Object[][]{
            {0, 1},
            {1, 0},
            {-5, 0.28366218546}
        };
    }
}
