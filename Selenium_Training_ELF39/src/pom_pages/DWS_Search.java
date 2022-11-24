package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Search extends Utility_Methods {
	
	public DWS_Search(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);	
	}
	@FindBy(id="small-searchterms")
	WebElement search_textField;
	
	@FindBy(xpath="//input[@value='Search']")
	WebElement search_btn;
	
	@FindBy(id="As")
	WebElement advance_search;
	
	public void Search_Text_Field(String value) {
		Enter_value_in_editfield(search_textField, value);
	}
	
	public void Search_button() {
		Click_element(search_btn);
	}
	
	public void Advance_Search() {
		advance_search.click();
	}
	
	

}
