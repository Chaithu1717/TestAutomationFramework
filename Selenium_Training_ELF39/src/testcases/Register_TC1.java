package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class Register_TC1  extends Base_Test{
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Register");
//		data[0][0]="Chaithanya";
//		data[0][1]="UK";
//		data[0][2]="chaithu@gmail.com";
//		data[0][3]="12345";
//		data[0][4]="12345";
		return data;
	}
	
	@Test(dataProvider= "TestData")
	public void TC1(String fname,String lname,String email,String paswd,String cpaswd)
	{
		WebElement reg=driver.findElement(By.xpath("//a[text()='Register']"));
		Utility_Methods.Click_element(reg);
		WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		Utility_Methods.Click_element(radio);
		WebElement firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
		Utility_Methods.Enter_value_in_editfield(firstname, fname);
		WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
		Utility_Methods.Enter_value_in_editfield(lastname, lname);
		WebElement emailID=driver.findElement(By.xpath("//input[@name='Email']"));
		Utility_Methods.Enter_value_in_editfield(emailID, email);
		WebElement password=driver.findElement(By.xpath("//input[@name='Password']"));
		Utility_Methods.Enter_value_in_editfield(password, paswd);
		WebElement confirm=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
		Utility_Methods.Enter_value_in_editfield(confirm, cpaswd);
		WebElement button=driver.findElement(By.xpath("//input[@name='register-button']"));
		Utility_Methods.Click_element(button);
	}
}

