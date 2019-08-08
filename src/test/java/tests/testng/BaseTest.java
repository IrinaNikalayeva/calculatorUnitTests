package tests.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    Calculator calculator;

    @BeforeClass
    public void setUp() {
         calculator = new Calculator();
    }
}
