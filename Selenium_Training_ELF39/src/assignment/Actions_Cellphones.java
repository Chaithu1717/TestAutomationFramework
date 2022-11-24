package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Cellphones {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com");
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("(//a[@href='/electronics'])[1]"));
		a.moveToElement(ele).build().perform();
		WebElement cell = driver.findElement(By.xpath("(//a[@href='/cell-phones'])[1]"));
		a.moveToElement(cell).click().build().perform();
	}

}
