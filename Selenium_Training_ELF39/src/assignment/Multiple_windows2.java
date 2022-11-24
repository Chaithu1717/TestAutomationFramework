package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_windows2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String parent_window = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		
		Set<String> all_window = driver.getWindowHandles();
		for(String tot:all_window) {
			driver.switchTo().window(tot);
			String title = driver.getTitle();
			if(title.equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				driver.close();
			}
		}
		driver.switchTo().window(parent_window);
		Thread.sleep(2000);
		driver.findElement(By.id("small-searchterms")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.close();
	}

}

