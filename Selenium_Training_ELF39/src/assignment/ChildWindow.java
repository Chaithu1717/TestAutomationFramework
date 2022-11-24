package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		Set<String> total = driver.getWindowHandles();
		System.out.println(total);
		
		for(String c:total) {
			driver.switchTo().window(c);
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				driver.findElement(By.name("email")).sendKeys("xxx@gmail.com");
				Thread.sleep(1000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		driver.close();
	}

}
