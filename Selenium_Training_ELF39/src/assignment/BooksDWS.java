package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BooksDWS {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Chaithu");
		driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("UK");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("chaithuu816@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("8197382224");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("8197382224");
		driver.findElement(By.xpath("//input[@name='register-button']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.linkText("Log out")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("chaithuu816@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("8197382224");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		WebElement sort = driver.findElement(By.id("products-orderby"));
		Select s=new Select(sort);
		s.selectByIndex(1);
		List<WebElement> book = driver.findElements(By.xpath("//div[@class='product-grid']//a"));
		for(int i=0;i<=book.size()-1;i++) {
			System.out.println(book.get(i).getText());
		
			}		
		driver.close();
	}

}
