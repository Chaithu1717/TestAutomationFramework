package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent_Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[@href='/computers'])[1]")).click();
		driver.findElement(By.xpath("(//a[@href='/desktops'])[3]")).click();
		WebElement cart = driver.findElement(By.xpath("//a[contains(text(),'cheap')]/../../div[3]/div[2]/input"));
		cart.click();
		Thread.sleep(2000);
		driver.close();

	}

}
