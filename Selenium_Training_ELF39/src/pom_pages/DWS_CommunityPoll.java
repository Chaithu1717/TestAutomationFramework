package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_CommunityPoll extends Utility_Methods {
	
	public DWS_CommunityPoll(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(id="pollanswers-1")
	WebElement excellent;
	
	@FindBy(id="pollanswers-2")
	WebElement good;
	
	@FindBy(id="pollanswers-3")
	WebElement bad;
	
	@FindBy(id="pollanswers-4")
	WebElement very_bad;
	
	@FindBy(id="vote-poll-1")
	WebElement vote_btn;
	
	public void Excellent() {
		Utility_Methods.Click_element(excellent);
		
	}
	public void Good() {
		Utility_Methods.Click_element(good);
	}
	
	public void Bad() {
		Utility_Methods.Click_element(bad);
	}
	public void Very_Bad() {
		Utility_Methods.Click_element(very_bad);
	}
	public void Vote_btn() {
		Utility_Methods.Click_element(vote_btn);
	}
	
	
	

}
