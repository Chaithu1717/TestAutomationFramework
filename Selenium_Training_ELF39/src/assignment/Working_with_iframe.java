package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/demo.html/iframe.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.close();
	}
	

}
