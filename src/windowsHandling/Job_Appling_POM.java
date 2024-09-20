package windowsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Job_Appling_POM {
	
	public static WebDriver driver;
	
	public Job_Appling_POM(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
	
	@FindBy(xpath = "(//input[@aria-label='Single line text'])[1]")
	WebElement Fullname;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[2]")
	WebElement emailID;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[3]")
	WebElement mobileNumber;
	
	@FindBy(xpath = "(//input[@name='rdbce8c03cd1745468e79d2747dfef4aa'])[1]")
	WebElement maleRadioButton;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[4]")
	WebElement currentCompanyWithDuration;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[5]")
	WebElement payrollCompany;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[6]")
	WebElement previousCompanyWithDuration;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[7]")
	WebElement roleincurrentcompany;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[8]")
	WebElement currentprojectname;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[9]")
	WebElement teamSize;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[10]")
	WebElement totalExperiance;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[11]")
	WebElement relevantexperiencewithSelenium;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[12]")
	WebElement relevantexperiencewithJava;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[13]")
	WebElement relevantExperienceWithBDDCucumber;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[14]")
	WebElement relevantExperienceWithApi;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[15]")
	WebElement currentLocation;
	
	@FindBy(xpath = "(//input[@name='r1827795c508e4bf2862c3bb68082ea50'])[3]")
	WebElement preferredLocation;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[16]")
	WebElement currentCTC;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[17]")
	WebElement expectedCTC;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[18]")
	WebElement ifCurrentlyHoldingAnOfferWhatIsTheOfferedAmount;

	@FindBy(xpath = "(//input[@aria-label='Single line text '])[19]")
	WebElement officialNoticePeriod;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[20]")
	WebElement noticePeriodNegotiableTo;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[21]")
	WebElement ifServingNoticePeriodWhenIsYourLastWorkingDay;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[22]")
	WebElement haveYouPreviouslyBeenEmployedByCapgemini;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[23]")
	WebElement reasonForJobChange;

	@FindBy(xpath = "(//input[@aria-label='Single line text '])[24]")
	WebElement highestQualificationUniversityNameYearOfPassing;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[25]")
	WebElement gapInEducation;
	
	@FindBy(xpath = "(//input[@aria-label='Single line text '])[26]")
	WebElement gapInEmployment;
	
	@FindBy(xpath = "(//input[@name='r16be5eaad1ac4ebbb77060a3f6fc23e6'])[1]")
	WebElement sharedUpdatedCV;
}
