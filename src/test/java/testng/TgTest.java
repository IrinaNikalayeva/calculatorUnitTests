package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgTest extends BaseTest {

    @Test(dataProvider = "tgTestData", groups = {"extended", "regression"})
    public void tgTest(double a, double expected) {
        double actual = calculator.tg(a);
        Assert.assertEquals(actual, expected, "wrong result. Method implementation is wrong");
    }

    @DataProvider(name = "tgTestData")
    public Object[][] doubleValues() {
        return new Object[][]{
            {0, 0},
            {1, 0.0699268},
            {6.25, 0.1095178}
        };
    }
}
