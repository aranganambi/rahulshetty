package testNG_Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuiteExample {
	
	WebDriver driver;
	long start_Time;
	long end_Time;
	long total_Time;
	
	@BeforeSuite
	private void browser_Launch() {
		start_Time=System.currentTimeMillis();
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test(priority = 0)
	private void open_Youtube() {
		driver.get("https://www.youtube.com");

	}
	@Test(priority = 1)
	private void open_Hotstar() {
		driver.get("htts://www.hotstar.com");

	}
	@Test(priority = 2)
	private void open_Google() {
		driver.get("https://www.google.com");

	}
	@AfterSuite
	private void close() {
		driver.quit();	
		end_Time=System.currentTimeMillis();
		total_Time=end_Time-start_Time;
		
		System.out.println("Total time taken : "+total_Time);
			
		

	}
	

}
