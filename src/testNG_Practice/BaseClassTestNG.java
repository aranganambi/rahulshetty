package testNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassTestNG {
	 static  WebDriver driver;
		
	//browser_Launch
	public static void browser_Launch() {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinoth kumar\\Downloads\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		catch (Exception e) {
			throw(e);
		}
	}

	// get_url
	public static void get_Url(String link) {
		driver.get(link);
	}
	
	//Maximize
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	// sendkeys
		public static void input_Value(WebElement name, String name1) {
			name.sendKeys(name1);
		}

		// click
		public static void clicks(WebElement clickin) {
			clickin.click();
		}

}
