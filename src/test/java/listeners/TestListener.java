package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("TEST PASSED" + "\n");
    }


    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("TEST FAILED " + iTestResult.getThrowable() + "\n");
    }


    public void onTestSkipped(ITestResult iTestResult) {

    }


    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }


    public void onStart(ITestContext iTestContext) {
        System.out.println("======STARTING " + iTestContext.getName() + " TESTS======");
    }


    public void onFinish(ITestContext iTestContext) {
        System.out.println("========FINISHED========");
    }

}
