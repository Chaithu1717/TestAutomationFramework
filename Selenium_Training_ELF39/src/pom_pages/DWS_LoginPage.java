package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWS_LoginPage {
	
	public  DWS_LoginPage (WebDriver driver){
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Email")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login_btn;
	
	public void Enter_username(String value) {
	username.sendKeys(value);
	}
	
	public void Enter_Password(String value) {
		password.sendKeys(value);
	}
	public void Click_Login() {
		login_btn.click();
	}
}
