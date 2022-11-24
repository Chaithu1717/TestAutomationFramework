package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Jewelry extends Utility_Methods {
	
	public DWS_Jewelry(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="products-orderby")
	WebElement sortby;
	
	@FindBy(id="products-pagesize")
	WebElement pagesize;
	
	@FindBy(id="products-viewmode")
	WebElement view;
	
	public void Sort_By(String sortby2) {
		Utility_Methods.selectByVisibleText(sortby, sortby2);
	}
	
	public void Page_Size(String value) {
		Utility_Methods.selectByVisibleText(pagesize, value);
	}
	
	public void View(String value) {
		Utility_Methods.selectByVisibleText(view, value);
	}

}
