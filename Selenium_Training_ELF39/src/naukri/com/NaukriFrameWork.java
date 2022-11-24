package naukri.com;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class NaukriFrameWork extends Base_Test {
	@DataProvider(name="TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Naukri");
		return data;
	}
	
	
	
	@Test(dataProvider= "TestData")
	public void login_naukri(String email,String pwd) {
		WebElement login_button=driver.findElement(By.id("login_Layer"));
		Utility_Methods.Click_element(login_button);
		
		WebElement email_text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		Utility_Methods.Enter_value_in_editfield(email_text, email);
		
		WebElement pwd_text = driver.findElement(By.xpath("//input[@type='password']"));
		Utility_Methods.Enter_value_in_editfield(pwd_text,pwd);
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		Utility_Methods.Click_element(login);
		
	}

}
