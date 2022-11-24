package assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_page {

	public static void main(String[] args) {
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				List<WebElement>radio_button=driver.findElements(By.className("radioButton"));
				for(int i=0;i<=radio_button.size()-1;i++) {
					radio_button.get(i).click();
				}
				driver.findElement(By.id("autocomplete")).sendKeys("ind");
				driver.findElement(By.id("ui-id-3")).click();
				WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
				Select s=new Select(dropdown);
				List<WebElement>options=s.getOptions();
				for(int i=0;i<=options.size()-1;i++) {
					s.selectByIndex(i);
				}
				driver.findElement(By.id("checkBoxOption1")).click();

	}

}
