package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import pom_pages.DWS_Homepage;
import pom_pages.DWS_Register;

public class DWS_RegisterTest extends Base_Test {
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Register");
		return data;
		
	}
	@Test(dataProvider = "TestData")
	public void TC02(String fname,String lname,String email,String pwd,String cpwd) {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.Click_Register();
		
		DWS_Register rg=new DWS_Register(driver);
		rg.Radio_btn();
		
		rg.Firstname(fname);
		rg.Lastname(lname);
		rg.Email(email);
		rg.Password(pwd);
		rg.ConfirmPassword(cpwd);
		
		
	}	
	}
	


