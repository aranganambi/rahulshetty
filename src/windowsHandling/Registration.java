package windowsHandling;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseClass.Base_Class;

public class Registration extends Base_Class {
	
	@Test
	public void chromeLaunching() {
		browser_Launch();
		maximize();
		waitimp();
		get_Url("https://demo.automationtesting.in/Register.html");
		System.out.println("Browser Launched Successfully");
	}
	
	@Test
	public void registoringUser() {
		Registration_POM r = new Registration_POM(driver);
		input_Value(r.getFirstname(),"Vinoth");
		input_Value(r.getLastname(), "Kumar");
		input_Value(r.getAddressField(), 
				"7/478, 11th Street, 7th block, Mogappair West, Chennai-37.");
		input_Value(r.getEmailField(), "vino52096@gmail.com");
		input_Value(r.getPhoneNumber(), "9080068137");
		clicks(r.getMaleRadioButton());
		clicks(r.getCheckbox1());
		//drop(r.getLanguageSelection(), "English");
		
		drop(r.getSkillsSelection(), "Android");
		
		drop(r.getCountrySelection(), null);
		
		
	
	}
	
	

}
