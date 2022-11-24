package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Locator {
	
public static void main(String [] args)
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Launch the chromebrowser
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("computers");
	driver.findElement(By.className("button-1 search-box-button")).click();
	
}

}
