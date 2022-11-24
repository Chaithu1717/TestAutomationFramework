package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe07 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[@class='new-navbar-highlighter'])[1]")).click();
		driver.close();
	}

}
