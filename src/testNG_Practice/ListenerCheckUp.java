package testNG_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListenerCheckUp {
	public WebDriver driver;
	
	@Test
	public void browser_Launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	public void openFacebook() {
		driver.get("https://www.facebook.com/login");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("jkdkdnak");
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("ksjlsakoaij");
		
		driver.findElement(By.id("loginbutton")).click();
	}
	
	

}
