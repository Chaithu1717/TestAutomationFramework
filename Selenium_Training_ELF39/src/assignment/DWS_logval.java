package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_logval {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("chaithuuk1712@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("9380771322");
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		String actualstring=driver.findElement(By.className("account")).getText();
		String expectedstring ="chaithuuk1712@gmail.com";
		
		if(expectedstring.equals(actualstring))
		{
			System.out.println("validation pass");
		}
		else
		{
			System.out.println("validation fail");
		}
		driver.close();
		
	}

}
