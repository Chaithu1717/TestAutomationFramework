package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> radiobutton = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<radiobutton.size();i++)
		{
			String a = radiobutton.get(i).getAttribute("value");
			System.out.println(a);
			radiobutton.get(i).click();
			Thread.sleep(2000);
		}
		
		driver.close();
		
	}

}
