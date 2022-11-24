package FrameWork_Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base_Test {
	public  static WebDriver driver;
	@BeforeClass
	public void BrowserSetup() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url=Utility_Methods.Test_Configuration();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	@AfterClass
	public void Teardown() {
		driver.close();
	}
}
