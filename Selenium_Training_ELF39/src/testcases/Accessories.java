package testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class Accessories extends Base_Test {
	
	@Test
	public void access() {
		
	WebElement target = driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
	Utility_Methods.ActionsUtility(target);
	WebElement accesories=driver.findElement(By.xpath("(//a[@href='/accessories'])[1]"));
	Utility_Methods.Click_element(accesories);

	}
	
}
