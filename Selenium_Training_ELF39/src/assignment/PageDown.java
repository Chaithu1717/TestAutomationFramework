package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("small-searchterms"));
		Actions a=new Actions(driver);
		a.moveToElement(search).click().click().perform();
		//a.sendKeys(search, "mobiles").perform();
		//Thread.sleep(2000);
		//a.sendKeys(Keys.PAGE_DOWN).perform();
		//a.keyDown(Keys.LEFT_SHIFT).sendKeys("mobiles").keyUp(Keys.LEFT_SHIFT).perform();
		a.keyDown(Keys.LEFT_CONTROL).sendKeys("v").keyUp(Keys.LEFT_CONTROL).perform();
		
	}

}
