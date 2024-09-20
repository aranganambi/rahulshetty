package testNG_Practice;
import java.sql.Driver;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintGoogleSuggestions {
	WebDriver driver;
	@BeforeSuite
	private void launchBrowser() {
		
	    driver = new ChromeDriver();
	    driver.get("https://www.google.co.in/");
	}
	@Test
	private void search() throws Throwable {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Thor");
		Thread.sleep(3000);
		List <WebElement> sugessitions = 
				(List<WebElement>) driver.findElement(By.xpath("(//ul[@role='listbox'])[1]//following::li"));
		
		for (WebElement webElement : sugessitions) {
			System.out.println(webElement.getText());
		}

	}

}
