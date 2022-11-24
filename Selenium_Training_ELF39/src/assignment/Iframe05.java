package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe05 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/demo.html/iframe.html");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement dws = driver.findElement(By.xpath("//iframe[@id='FR1']"));
		driver.switchTo().frame(dws);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		}

}
