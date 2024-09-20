package testNG_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Facebook {
	public static WebDriver driver;

	public void facebook_POM(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement username;
	
	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		username = username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		password = password;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		LoginButton = loginButton;
	}

	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath = "//*[@type='submit']")
	WebElement LoginButton;
}
