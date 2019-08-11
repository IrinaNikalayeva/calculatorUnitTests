import listeners.TestngListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestngRunner {

    public static void main(String[] args) {
        TestNG testNg = new TestNG();
        testNg.addListener(new TestngListener());

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/test/resources/TestSuite.xml"));


        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNg.setXmlSuites(suites);
        testNg.run();
    }
}
