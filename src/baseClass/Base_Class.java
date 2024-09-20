package baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	 protected static  WebDriver driver;
	
	//browser_Launch
	public static void browser_Launch() {
		try {
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
	
	//FullScreen
	public static void fullScreen() {
		driver.manage().window().fullscreen();
	}
	
	//Set_Size
	public static void set_Size(int a, int b) {
		Dimension d = new Dimension(a, b);
		driver.manage().window().setSize(d);
	}

	// sendkeys
	public static void input_Value(WebElement name, String username) {
		name.sendKeys(username);
	}

	// click
	public static void clicks(WebElement clickin) {
		clickin.click();
	}

	//move_element
	public static void Movein(WebElement move) {
		Actions act = new Actions(driver);
		act.moveToElement(move).build().perform();
	}
	//context
	public static void context(WebElement user) {
		Actions act = new Actions(driver);
		act.contextClick(user).build().perform();
	}
	//double_Click
	public static void doubl(WebElement user) {
		Actions act = new Actions(driver);
		act.doubleClick(user).build().perform();
	}
	//robot
	public static void robot() throws Throwable {
		Robot r = new Robot();
	}
	//robot_Down
	public static void robot_Down() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}
	//robot_Up
	public static void robot_UP() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
	}
	//robot_Enter
	public static void robot_Enter() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
	//robot_Keyrelease_Down
	public static void robot_Down_keyrelease() throws Throwable {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
		
	}
	//robot_Keyrelease_Up
	public static void robot_Up_Keyrelease() throws Throwable {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_UP);
	}
	
	//robot_TAB
	public static void robot_Tab() throws Throwable {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
	}
	
	//for_loop
	public static void looping(WebElement loops) { 
		for (int i = 0; i < 3; i++) {
			loops.click();
		}	
	}
	
	//drop_down
	public static void drop(WebElement dropdown, String i) {
		Select s = new Select(dropdown);
		s.selectByVisibleText(i);
	}
	public static void scroll_Up() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,-600)", " ");
	}
		
	//scroll_down
	public static void scroll_Down() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,1000)", " ");
	}
	//screen_shot
	public static void screenshot() throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("C:\\Users\\vinoth kumar\\eclipse-workspace\\Selenium_Practice\\screenshot\\snap.png");
		FileUtils.copyFile(from, to);
	}
	
	//wait
	public static void waitimp() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	}
	//quit
	public static void quit() {
		driver.quit();
	}
	//close
	private void close() {
		driver.close();
	}
	//navigate
	public static void transfer(String url) {
		driver.navigate().to(url);
	}
	//navigation_forward
	public static void forward() {
		driver.navigate().forward();
	}
	//backward
	public static void backward() {
		driver.navigate().back();
	}
	//refresh
	public static void refresh() {
		driver.navigate().refresh();
	}
	//get
	public static void title() {
		driver.getTitle();
	}
	//thread
	public static void thread() throws Throwable {
		Thread.sleep(3000);
	}
	//alert_accept
	public static void alert_Accept() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}
	//alert_dismiss
	public static void alert_Dismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}
	//alert_Keys
	public static void alert_Keys(String keys) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(keys);
		al.accept();
	}
	public static void text() {
		driver.getTitle();
	
		
	}
}
