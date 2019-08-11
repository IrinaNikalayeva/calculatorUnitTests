package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestngListener implements ITestListener {

    public void onTestStart(ITestResult iTestResult) {
        System.out.println(iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("TEST PASSED");
    }


    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("TEST FAILED: " + iTestResult.getName() + " " + iTestResult.getThrowable());
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
