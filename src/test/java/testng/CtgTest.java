package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgTest extends BaseTest {

    @Test(dataProvider = "ctgTestData", groups = {"extended", "regression"})
    public void cgTest(double a, double resultTg) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, resultTg, "wrong result. Method implementation is wrong");
    }

    @DataProvider(name = "ctgTestData")
    public Object[][] doubleValues() {
        return new Object[][]{
                {0, 0},
                {1, 0.0699268},
                {6.25, 0.1095178}
        };
    }

}
