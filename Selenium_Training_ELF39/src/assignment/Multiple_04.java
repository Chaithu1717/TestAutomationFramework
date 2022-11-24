package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sanjay/Downloads/MultipleWindow.html");
		driver.manage().window().maximize();
		String parent_window = driver.getWindowHandle();
		System.out.println(parent_window);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(5000);
		Set<String> all = driver.getWindowHandles();
		
		for(String tot:all) {
			driver.switchTo().window(tot);
			String title = driver.getTitle();
			if (title.equalsIgnoreCase("Olive Garden Italian Restaurant | Family Style Dining | Italian Food"))
				driver.close();
			}
		}

}