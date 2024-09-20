package testNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportExample {
	WebDriver driver;
	ExtentReports reports;
	//ExtentHtmlReporter html;
	
	@BeforeSuite
	public void openBrowser() {
		reports = new ExtentReports();
		//ExtentHtmlReporter html = new ExtentHtmlReporter("user/build/name/Extent.html");
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
	@Test
	public void openYouTube() {
		driver.get("https://www.youtube.com");
		String title = driver.getTitle();
		if (title.equals("YouTube")) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}
	}
	@Test
	public void openFaceBook() {
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("facebook")) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED");
		}
	}
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}
}
