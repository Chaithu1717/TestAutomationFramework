package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_xpath {
public static void main (String []args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Sanjay/Downloads/xpath1.html");
	driver.findElement(By.xpath("(//input)[1]")).sendKeys("Chaithu");
	driver.findElement(By.xpath("(//input)[2]")).sendKeys("UK");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("tyss");
	driver.findElement(By.xpath("(//input)[4]")).sendKeys("bnglr");
	}
}

