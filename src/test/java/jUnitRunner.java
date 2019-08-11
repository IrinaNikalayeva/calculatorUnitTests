import junit.*;
import listeners.JunitListener;
import org.junit.runner.JUnitCore;

public class jUnitRunner {
    public static void main(String[] args) {

        JUnitCore runner = new JUnitCore();
        runner.addListener(new JunitListener());
        runner.run(SumLongTest.class, SubLongTest.class, SinTest.class, MultLongTest.class, IsNegativeTest.class,
                DivLongTest.class);
    }


}


