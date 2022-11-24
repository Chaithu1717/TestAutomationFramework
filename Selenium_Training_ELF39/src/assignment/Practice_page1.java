package assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_page1 {

	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				driver.get("https://www.rahulshettyacademy.com/AutomationPractice");
				String parent=driver.getWindowHandle();
				System.out.println(parent);
				driver.findElement(By.id("openwindow")).click();
				Set<String> total=driver.getWindowHandles();
				System.out.println(total);
				for(String child:total) {
					String tittle=driver.switchTo().window(child).getTitle();
					System.out.println(tittle);
					if(driver.getTitle().equalsIgnoreCase("QA Click Academy | Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy")) {
						driver.findElement(By.linkText("Register")).click();
						driver.close();
					}
				}
				driver.switchTo().window(parent);
			driver.findElement(By.name("radioButton")).click();
				driver.findElement(By.name("enter-name")).sendKeys("Chaithanya");
				driver.findElement(By.id("confirmbtn")).click();
				Alert ale=driver.switchTo().alert();
				ale.accept();

	}

}
