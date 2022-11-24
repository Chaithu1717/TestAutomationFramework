package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_Register  {
	
	public DWS_Register(WebDriver driver){
		
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="gender-female")
	WebElement radio_btn;
	
	@FindBy(id="FirstName")
	WebElement firstname;
	
	@FindBy(id="LastName")
	WebElement lastname;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement cpassword;
	
	public void Radio_btn() {
		radio_btn.click();
	}
	public void Firstname(String value) {
		firstname.sendKeys(value);
		}
	public void Lastname(String value) {
		lastname.sendKeys(value);
	}
	public void Email(String value) {
		email.sendKeys(value);
	}
	public void Password(String value) {
		password.sendKeys(value);
	}
	public void ConfirmPassword(String value) {
		cpassword.sendKeys(value);
	}
	

}
