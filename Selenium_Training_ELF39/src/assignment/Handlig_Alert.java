package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handlig_Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions a=new Actions(driver);
		a.doubleClick(doubleclick).build().perform();
		Thread.sleep(2000);
		Alert ale=driver.switchTo().alert();
		ale.accept();
		driver.close();
	}
}