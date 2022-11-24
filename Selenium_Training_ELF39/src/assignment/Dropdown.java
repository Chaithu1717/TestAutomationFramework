package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sanjay/Downloads/demo.html");
		WebElement dropdown = driver.findElement(By.id("standard_cars"));
		
		//creating an object of select class
		Select s=new Select(dropdown);
		Thread.sleep(1000);
		
		//select by visible text
		s.selectByVisibleText("Jaguar");
		
		Thread.sleep(1000);
		
		//select by value
		
		s.selectByValue("min");
		Thread.sleep(1000);
		
		//select by index
		s.selectByIndex(2);
		
	}

}
