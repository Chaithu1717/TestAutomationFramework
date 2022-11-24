package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_ShoppingKart {
	 public  DWS_ShoppingKart (WebDriver driver) {
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(id="CountryId")
	 WebElement country;
	 
	 @FindBy(id="ZipPostalCode")
	 WebElement code;
	 
	 @FindBy(xpath="//input[@value='Estimate shipping']")
	 WebElement button;
	 
	 public void Country(String value) {
		 Utility_Methods.selectByVisibleText(country, value);
	 }
	 public void Code(String value) {
		 Utility_Methods.Enter_value_in_editfield(code, value);
	 }
	 public void Button() {
		 Utility_Methods.Click_element(button);
	 }

}
