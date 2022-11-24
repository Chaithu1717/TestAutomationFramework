package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sanjay/Downloads/xpath1.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[1]")).sendKeys("Chaithanya");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).sendKeys("UK");
		driver.findElement(By.xpath("/html/body/div[2]/input[1]")).sendKeys("TYSS");
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Bengaluru");
		driver.close();
	}

}
