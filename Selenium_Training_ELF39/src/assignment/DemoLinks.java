package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sanjay/Downloads/demo.html");
		List<WebElement> text = driver.findElements(By.xpath("//input[@type='text']"));
		for(int i=0;i<=text.size()-1;i++) {
			text.get(i).sendKeys("haii");
		}
	}

}
