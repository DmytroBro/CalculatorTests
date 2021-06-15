package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    public void onTestStart(ITestResult result){
        System.out.println("test has been started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("Test finished with success: " + result.getName());
    }

    public void onTestFailure(ITestResult result){
        System.out.println("Test finished with failure: " + result.getName());
    }
}
