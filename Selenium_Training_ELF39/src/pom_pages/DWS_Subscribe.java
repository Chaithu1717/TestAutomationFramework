package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Subscribe {
	
	public DWS_Subscribe (WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="newsletter-email")
	WebElement email;
	
	@FindBy(id="newsletter-subscribe-button")
	WebElement subscribe;

	
	public void Email(String value) {
		Utility_Methods.Enter_value_in_editfield(email, value);
		
	}
	public void Button() {
		Utility_Methods.Click_element(subscribe);
	}
}
