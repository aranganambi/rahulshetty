package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenWithXlsSheet {
	WebDriver driver;
 
	String[][] data = null;
 	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() throws Throwable {
		data=getExcelSheetData();
		return data;
	}
	
	public String[][] getExcelSheetData() throws Throwable, Throwable {
		FileInputStream excel = new FileInputStream("C:\\Users\\vinoth kumar\\Desktop\\TestData.xlsx");
		Workbook workBook = Workbook.getWorkbook(excel);
		Sheet sheet = workBook.getSheet(0);
		
		int rowsCount = sheet.getRows();
		int columnsCount = sheet.getColumns();
		
		 String testData[][] = new String[rowsCount-1][columnsCount];
		 
		for (int i = 1; i < rowsCount; i++) {
			for (int j = 0; j < columnsCount; j++) {
				testData [i-1][j] = sheet.getCell(j,i).getContents();
			}
		}
		return testData;
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


