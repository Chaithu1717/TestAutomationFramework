package assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sanjay/Downloads/demo.html");
		
		WebElement file = driver.findElement(By.id("resume"));
		
		Actions a =new Actions(driver);
		a.moveToElement(file).click().perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_X);
		r.keyPress(KeyEvent.VK_P);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_H);
		for(int i=0;i<=2;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
