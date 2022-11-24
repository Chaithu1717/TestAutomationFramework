package TestNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataprovider {

	@DataProvider(name="Testdata")
	public Object[][] testdata(){
		Object [][] data=new Object[2][2];
		data[0][0]="anu@gmail.com";
		data[0][1]="12345";
		return data;
	
	}
	@Test(dataProvider="Testdata")
	public void testdatademo(String uname,String pwd) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(uname);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
		driver.close();
	}
}

