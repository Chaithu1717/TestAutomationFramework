package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_AdvanceSearch extends Utility_Methods {
	
	public DWS_AdvanceSearch(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="Cid")
	WebElement category;
	
	@FindBy(id="Isc")
	WebElement auto;
	
	@FindBy(id="Mid")
	WebElement manufacture;
	
	@FindBy(id="Pf")
	WebElement from;
	
	@FindBy(id="Pt")
	WebElement to;
	
	public void Category(String value) {
		Utility_Methods.selectByVisibleText(category, value);
	}
	
	public void Auto_Click() {
		Utility_Methods.Click_element(auto);
	}
	
	public void Manufacture(String value) {
		Utility_Methods.selectByVisibleText(manufacture, value);
	}
	
	public void From(String value) {
		Utility_Methods.Enter_value_in_editfield(from, value);
	}
	
	public void To(String value) {
		Utility_Methods.Enter_value_in_editfield(to, value);
	}
	
	
	
	

}
