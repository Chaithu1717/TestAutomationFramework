package pom_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Digital extends Utility_Methods {
	
	public DWS_Digital() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	WebElement cart;
	
	public void Cart() {
		Utility_Methods.Click_element(cart);
	}

}
