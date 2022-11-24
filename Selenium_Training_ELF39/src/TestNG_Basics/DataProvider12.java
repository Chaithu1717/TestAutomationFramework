package TestNG_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider12 {
	
	@DataProvider(name = "TestData")
	public Object[][] testdata(){
		Object[][] data=new Object[5][5];
		data[0][0]="Chaithanya";
		data[0][1]="UK";
		data[0][2]="chaithu@gmail.com";
		data[0][3]="12345";
		data[0][4]="12345";
		data[1][0]="Ananya";
		data[1][1]="UK";
		data[1][2]="anut@gmail.com";
		data[1][3]="23456";
		data[1][4]="23456";
		data[2][0]="Tara";
		data[2][1]="sukanya";
		data[2][2]="tara@gmail.com";
		data[2][3]="123456";
		data[2][4]="123456";
		data[3][0]="nethra";
		data[3][1]="umesh";
		data[3][2]="nethra@gmail.com";
		data[3][3]="123456";
		data[3][4]="123456";
		data[4][0]="Umesh";
		data[4][1]="KC";
		data[4][2]="Umesh@gmail.com";
		data[4][3]="123456";
		data[4][4]="123456";
			
		return data;
	}
@Test(dataProvider = "TestData")
public void register(String fname,String sname,String email,String pwd,String cpwd)
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys(fname);
	driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys(sname);
	driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
	driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys(cpwd);
	driver.findElement(By.xpath("//input[@name='register-button']")).click();
}
}
