package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Monster_Action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.monsterindia.com/");
		Actions a=new Actions(driver);
		WebElement Jobsearch = driver.findElement(By.xpath("(//a[@data-check='menutab'])[1]"));
		a.moveToElement(Jobsearch).build().perform();
		Thread.sleep(2000);
		WebElement jobskill = driver.findElement(By.xpath("(//a[contains(text(),'Skills')])[1]"));
		a.moveToElement(jobskill).build().perform();
		Thread.sleep(2000);
		WebElement javajob = driver.findElement(By.xpath("(//a[contains(text(),'Java Jobs')])[1]"));
		a.moveToElement(javajob).click().build().perform();
		driver.close();
	}

}
