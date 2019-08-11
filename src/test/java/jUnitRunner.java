import junit.*;
import listeners.JunitListener;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(Suite.class)
//@Suite.SuiteClasses({SumLongTest.class, SubLongTest.class} )
public class jUnitRunner {
  public static void main(String[] args) {

      JUnitCore runner = new JUnitCore();
        //<strong>//Adding listener here</strong>
              runner.addListener(new JunitListener());
      runner.run(SumLongTest.class, SubLongTest.class, SinTest.class, MultLongTest.class, IsNegativeTest.class,
              DivLongTest.class);
  }


   }


