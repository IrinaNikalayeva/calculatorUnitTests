package listeners;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

public class JunitListener extends RunListener {

    public void testRunStarted(Description description) throws Exception {
        System.out.println("Number of tests to execute: " + description.testCount() + "\n");
    }

    public void testStarted(Description description) throws Exception {
        System.out.println("STARTED: " + description);
    }

    public void testFinished(Description description) throws Exception {
        System.out.println("FINISHED " + description + "\n");
    }

    public void testRunFinished(Result result) throws Exception {
        System.out.println("Number of tests executed: " + result.getRunCount());
    }
}
