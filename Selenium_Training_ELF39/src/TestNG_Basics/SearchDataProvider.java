package TestNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchDataProvider {
	@DataProvider(name="Testdata")
	public Object[][] testdata(){
		Object [][] data=new Object[1][1];
		data[0][0]="books";
		return data;
	}
	@Test(dataProvider="Testdata")
		public void searchdemo(String search) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.close();
	}
	

}
