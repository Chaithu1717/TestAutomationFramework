package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Books")).click();
		WebElement sort=driver.findElement(By.id("products-orderby"));
		Select s=new Select(sort);
		String Expected="Name: A to Z";
		List<WebElement>test=s.getOptions();
		for(int i=0;i<=test.size()-1;i++) {
		String actual=test.get(i).getText();
		System.out.println(actual);
			if(actual.equals(Expected)) {
			System.out.println(i);
			break;
			}
		}
		driver.close();
		}
		}
