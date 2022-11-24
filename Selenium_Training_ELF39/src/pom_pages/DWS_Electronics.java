package pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import FrameWork_Utility.Utility_Methods;

public class DWS_Electronics {
	
		public DWS_Electronics(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="(//a[@href='/camera-photo'])[4]")
		WebElement camera;
		
		@FindBy(xpath="//a[text()='1MP 60GB Hard Drive Handycam Camcorder']")
		WebElement cam;
		
		@FindBy(xpath="//input[@value='Email a friend']")
		WebElement email_btn;
		
		@FindBy(id="FriendEmail")
		WebElement friend_email;
		
		@FindBy(id="YourEmailAddress")
		WebElement your_email;
		
		@FindBy(xpath="//input[@name='send-email']")
		WebElement submit_btn;
		
		public void Camera() {
			Utility_Methods.Click_element(camera);
		}
		
		public void Cam() {
			Utility_Methods.Click_element(cam);
		}
		public void Email_btn() {
			Utility_Methods.Click_element(email_btn);
		}
		public void Friend(String value) {
			Utility_Methods.Enter_value_in_editfield(friend_email, value);
		}
		public void Your(String Value) {
			Utility_Methods.Enter_value_in_editfield(your_email, Value);
		}
		public void Submit() {
			Utility_Methods.Click_element(submit_btn);
		}
		
		
		
		
}
