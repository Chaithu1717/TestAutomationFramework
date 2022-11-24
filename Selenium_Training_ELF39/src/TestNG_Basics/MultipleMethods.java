package TestNG_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleMethods {
	@Test
	public void MedicalShop() {
		System.out.println("Welcome to Medical shop");
	}
	@Test
	public void Petshop() {
		System.out.println("Welcome to pet shop");
	}
//	@Test
//	public void Vegshop() {
//		System.out.println("Welcome to Vegshop");
//	}
//	@Test
//	public void Eggshop() {
//		System.out.println("Welcome to egg shop");
//	}
	@BeforeSuite
	public void suit() {
		System.out.println("Before suite ");
	}
	@BeforeTest
	public  void test() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void classMethod() {
		System.out.println("Before class ");
	}
	@BeforeMethod
	public void method() {
		System.out.println("Before method ");
	}
	@AfterSuite
	public void aftersuit() {
		System.out.println("After suite");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method");
	}

}
