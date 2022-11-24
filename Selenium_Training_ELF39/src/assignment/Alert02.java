package assignment;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement right = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		a.contextClick(right).build().perform();
		List<WebElement> context_menu = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//li/span"));
		for(int i=0;i<context_menu.size()-1;i++) {	
			a.contextClick(right).build().perform();
			context_menu.get(i).click();
			Thread.sleep(2000);
			Alert ale=driver.switchTo().alert();
			ale.accept();
		}
		driver.close();
	}

}
