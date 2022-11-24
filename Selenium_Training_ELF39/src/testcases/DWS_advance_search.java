package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;

public class DWS_advance_search extends Base_Test {
	@DataProvider(name="Testdata")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("AdvanceSearch");
//		data[0][0]="books";
//		data[0][1]=0;
//		data[0][2]="Tricentis";
//		data[0][3]="1000";
//		data[0][4]="200";
		return data;
	}
	
	
	@Test(dataProvider="Testdata")
	public void advance(String book,String index,String text,String price,String price2) {
		
		WebElement small=driver.findElement(By.id("small-searchterms"));
		Utility_Methods.Enter_value_in_editfield(small,book);
		
		WebElement search=driver.findElement(By.xpath("//input[@value='Search']"));
		Utility_Methods.Click_element(search);
		
		WebElement as=driver.findElement(By.id("As"));
		Utility_Methods.Click_element(as);
		
		WebElement category = driver.findElement(By.id("Cid"));
		Utility_Methods.selectByVisibleText(category, index);
		
		WebElement isc=driver.findElement(By.id("Isc"));
		Utility_Methods.Click_element(isc);
		
		WebElement manufacture = driver.findElement(By.id("Mid"));
		Utility_Methods.selectByVisibleText(manufacture, text);
		
		WebElement pf=driver.findElement(By.id("Pf"));
		Utility_Methods.Enter_value_in_editfield(pf, price);
		
		WebElement pt=driver.findElement(By.id("Pt"));
		Utility_Methods.Enter_value_in_editfield(pt, price2);
		
		WebElement sid=driver.findElement(By.id("Sid"));
		Utility_Methods.Click_element(sid);
		
		WebElement sbutton=driver.findElement(By.xpath("//input[@class='button-1 search-button']"));
		Utility_Methods.Click_element(sbutton);
		
		
	}

}
