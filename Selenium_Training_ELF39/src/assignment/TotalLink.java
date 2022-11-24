package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		for(int i=0;i<=link.size()-1;i++)
		{
			System.out.println(link.get(i).getText());
		}
		int count=link.size();
		System.out.println(count);
	}

}
