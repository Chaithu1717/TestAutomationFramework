package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
//		WebDriverWait wait=new WebDriverWait(driver, 25);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Register']"))));
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Chaii");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("UK");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("chaithusonu13@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("9380771322");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("9380771322");
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='register-button']"))));
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		driver.close();
		
	}

}
