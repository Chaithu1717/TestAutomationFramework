package pom_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;
public class DWS_Homepage extends Utility_Methods {
	
	//constructer to initialize the driver instance and Webelement
	public DWS_Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//Webelements
	@FindBy(xpath="//a[text()='Log in']")
	WebElement login_link;
	
	@FindBy(xpath="//a[@class='ico-register']")
	WebElement register_link;
	
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	WebElement computers;
	
	@FindBy(xpath="(//a[@href='/accessories'])[1]")
	WebElement accesories;
	
	@FindBy(xpath="(//a[@href='/jewelry'])[1]")
	WebElement jewelry;
	
	@FindBy(xpath="(//a[@href='/apparel-shoes'])[1]")
	WebElement apparel;
	
	@FindBy(xpath="(//a[@href='/electronics'])[1]")
	WebElement ele;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	WebElement kart;
	
	@FindBy(xpath="(//a[@href='/gift-cards'])[1]")
	WebElement gift;
	
	@FindBy(xpath="(//a[@href='/digital-downloads'])[1]")
	WebElement digital;
	
	@FindBy(xpath="//a")
	List<WebElement> links;
	
	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	WebElement books;

	//Method
	public void Click_Login() {
		Utility_Methods.Click_element(login_link);
	}
	public void Click_Register() {
		Utility_Methods.Click_element(register_link);
	}
	public void Mouse_Hover_On_Computer() {
		Utility_Methods.ActionsUtility(computers);
	}
	public void Hover_On_Accesories() {
		Utility_Methods.ActionsUtility(accesories).click(accesories);
	
	}
	public void Jewelry() {
		Utility_Methods.Click_element(jewelry);
	}
	public void Apparel() {
		Utility_Methods.Click_element(apparel);
	}
	
	public void Electronic() {
		Utility_Methods.Click_element(ele);
	}
	public void Kart() {
		Utility_Methods.Click_element(kart);
	}
	public void Gift() {
		Utility_Methods.Click_element(gift);
	}
	public void Digital() {
		Utility_Methods.Click_element(digital);
	}
	public void Links() {
		for(int i=0;i<=links.size()-1;i++) {
			System.out.println(links.get(i).getText());
		}
	
	}
	public void book_click() {
		ActionsUtility(books).moveToElement(books).click().perform();
	}
	
	

	
}
