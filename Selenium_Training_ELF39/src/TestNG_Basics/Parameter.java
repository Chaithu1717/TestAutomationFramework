package TestNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({"URL" , "value"})
	
	@Test
	public void parelleldemo(String url,String value) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("small-searchterms")).sendKeys(value);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.close();
	}

}
