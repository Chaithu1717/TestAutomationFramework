package testcases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class Search_TC extends Base_Test{
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException{
		Object [][] data=Utility_Methods.getTestData("Search");
		//data[0][0]="books";
		return data;
	}
	
	@Test(dataProvider="Testdata")
	
	public void TC3(String value) {
	
		WebElement small=driver.findElement(By.id("small-searchterms"));
		Utility_Methods.Enter_value_in_editfield(small, value);
		WebElement search=driver.findElement(By.xpath("//input[@value='Search']"));
		Utility_Methods.Click_element(search);
		
	}

}
