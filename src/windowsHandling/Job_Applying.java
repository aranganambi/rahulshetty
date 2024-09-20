package windowsHandling;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import baseClass.Base_Class;

public class Job_Applying extends Base_Class {
	
	@Test
	public void chromeLaunch() {
		browser_Launch();
		maximize();
		waitimp();
		get_Url("https://forms.office.com/pages/responsepage.aspx?id=Wq6idgCfa0-V7V0z13xNYafdLkmCOf9FopOSmxqm9KpURDYxU09YSzRUMzZNM0VTTExJR0owWEpYRy4u");
		System.out.println("Chrome Launched Successfully");
	}
	@Test
	public void jobApplying() {
		Job_Appling_POM j = new Job_Appling_POM(driver);
//		input_Value(j.getFullname(),"Aranganambi Elumalai";
//		input_Value(j.getFullname(), "Aranganambi Elumalai");
		//input_Value(j.getEmailID(), "aranganambi.elumalai@gmail.com");

	}
	
	
}
