package testNG_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenExample {
	public static WebDriver driver;

	String [][] data={
	{"dummy","dummy"},
	{"dummy","Eras@7871044138"},
	{"vino52096@hotmail.com","dummy"},
	{"vino52096@hotmail.com","Eras@7871044138"}
	};
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
	}
	@BeforeTest
	public void beforeLogin() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth kumar\\Downloads\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();	
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "loginData")
	public void login(String Username, String Password){
		driver.get("https://www.facebook.com/");
		
		WebElement element1 = driver.findElement(By.id("email"));
		element1.sendKeys(Username);
		 
		WebElement pword = driver.findElement(By.id("pass"));
		pword.sendKeys(Password);
 		
		WebElement lButton = driver.findElement(By.xpath("//button[text()='Log in']"));
		lButton.click();
		}
	@AfterTest
	public void afterLogin() {
		driver.quit();
	}

}
