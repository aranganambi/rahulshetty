package windowsHandling;

import org.jsoup.select.Evaluator.Id;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_POM {
	
	public static WebDriver driver;
	
	Registration_POM(WebDriver driver1){
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	@FindBy(xpath = "//input[@placeholder='First Name']")
		WebElement firstname;
	
	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public void setLastname(WebElement lastname) {
		Lastname = lastname;
	}
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement Lastname;

	
	public WebElement getAddressField() {
		return addressField;
	}

	public void setAddressField(WebElement addressField) {
		this.addressField = addressField;
	}

	public WebElement getEmailField() {
		return emailField;
	}

	public void setEmailField(WebElement emailField) {
		this.emailField = emailField;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(WebElement phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public void setMaleRadioButton(WebElement maleRadioButton) {
		this.maleRadioButton = maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public void setFemaleRadioButton(WebElement femaleRadioButton) {
		this.femaleRadioButton = femaleRadioButton;
	}

	public WebElement getCheckbox1() {
		return checkbox1;
	}

	public void setCheckbox1(WebElement checkbox1) {
		this.checkbox1 = checkbox1;
	}

	public WebElement getCheckbox2() {
		return checkbox2;
	}

	public void setCheckbox2(WebElement checkbox2) {
		this.checkbox2 = checkbox2;
	}

	public WebElement getCheckbox3() {
		return checkbox3;
	}

	public void setCheckbox3(WebElement checkbox3) {
		this.checkbox3 = checkbox3;
	}

	public WebElement getLanguageSelection() {
		return languageSelection;
	}

	public void setLanguageSelection(WebElement languageSelection) {
		this.languageSelection = languageSelection;
	}

	public WebElement getSkillsSelection() {
		return skillsSelection;
	}

	public void setSkillsSelection(WebElement skillsSelection) {
		this.skillsSelection = skillsSelection;
	}

	public WebElement getCountries() {
		return countries;
	}

	public void setCountries(WebElement countries) {
		this.countries = countries;
	}

	public WebElement getCountrySelection() {
		return countrySelection;
	}

	public void setCountrySelection(WebElement countrySelection) {
		this.countrySelection = countrySelection;
	}

	public WebElement getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(WebElement yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getDate() {
		return date;
	}

	public void setDate(WebElement date) {
		this.date = date;
	}

	public WebElement getCreatePassword() {
		return createPassword;
	}

	public void setCreatePassword(WebElement createPassword) {
		this.createPassword = createPassword;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public WebElement getSubmit_Button() {
		return submit_Button;
	}

	public void setSubmit_Button(WebElement submit_Button) {
		this.submit_Button = submit_Button;
	}
	
	
	

	@FindBy(xpath = "//textarea[@rows='3']")
	WebElement addressField;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@type='tel']")
	WebElement phoneNumber;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	WebElement maleRadioButton;
	
	@FindBy(xpath = "(//input[@type='radio'])[2]")
	WebElement femaleRadioButton;
	
	@FindBy(id = "checkbox1")
	WebElement checkbox1;
	
	@FindBy(id = "checkbox2")
	WebElement checkbox2;
	
	@FindBy(id = "checkbox3")
	WebElement checkbox3;
	
	@FindBy(xpath = "//a[.='English']")
	WebElement languageSelection;
	
	@FindBy(id = "Skills")
	WebElement skillsSelection;
	
	@FindBy(id = "countries")
	WebElement countries;
	
	@FindBy(xpath = "//li[text()='India']")
	WebElement countrySelection;
	
	@FindBy(xpath = "//*[text()='1996']")
	WebElement yearOfBirth;
	
	@FindBy (xpath = "//*[text()='May']")
	WebElement month;
	
	@FindBy (xpath = "//*[text()='20']")
	WebElement date;
	
	@FindBy (id = "firstpassword")
	WebElement createPassword;
	
	@FindBy (id = "secondpassword")
	WebElement confirmPassword;

	@FindBy (id = "submitbtn")
	WebElement submit_Button;

	
	}
	

