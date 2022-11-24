package testcases;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class Login_TC extends Base_Test{
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException{
		Object [][] data=Utility_Methods.getTestData("Login");
//		data[0][0]="chaithuuk1712@gmail.com";
//		data[0][1]="9380771322";
		return data;
	}
@Test(dataProvider="Testdata")
public void TC2(String uname,String pswd) {
	
	WebElement button=driver.findElement(By.className("ico-login"));
	Utility_Methods.Click_element(button);
	WebElement ele=driver.findElement(By.id("Email"));
	Utility_Methods.Enter_value_in_editfield(ele, uname);
	WebElement pwd=driver.findElement(By.id("Password"));
	Utility_Methods.Enter_value_in_editfield(pwd,pswd );
	WebElement login=driver.findElement(By.cssSelector("input[value=\"Log in\"]"));
	Utility_Methods.Click_element(login);
	
	WebElement logout=driver.findElement(By.xpath("//a[text()='Log out']"));
	Utility_Methods.Click_element(logout);
	
	}


}
