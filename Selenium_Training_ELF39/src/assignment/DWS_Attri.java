package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DWS_Attri {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		String a=driver.findElement(By.id("small-searchterms")).getAttribute("Value");
		System.out.println(a);
		driver.findElement(By.id("small-searchterms")).sendKeys("books");
		String b=driver.findElement(By.id("small-searchterms")).getAttribute("value");
		System.out.println(b);
		String c=driver.findElement(By.linkText("Shopping cart")).getAttribute("color");
		System.out.println(c);
		driver.close();
		
	}

}
