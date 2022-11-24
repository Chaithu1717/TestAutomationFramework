package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DWS_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@href='/books'])[1]")).click();
		WebElement sort = driver.findElement(By.id("products-orderby"));
		Select s=new Select(sort);
		List<WebElement> op = s.getOptions();
		int size=op.size();
		for(int i=0;i<size-1;i++) {
			String opt=op.get(i).getText();
			System.out.println(opt);
			}		
		
	}

}

