package testNG_Practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExamples implements ITestListener {
	
	WebDriver driver;
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		try {
		System.out.println("Test Failed");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\vinoth kumar\\eclipse-workspace\\TestngWithJava\\ScreenShot\\snap.png");
		FileUtils.copyFile(from, to);
		} catch (IOException e) {
			System.out.println("Screen not able to copy");
		}
		
	}
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("TestFailedButWithinSuccessPercentage");
		
	}
	
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Test FailedWithTimeout");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
	}
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Start");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
		
	}
	
	
	
	
}
