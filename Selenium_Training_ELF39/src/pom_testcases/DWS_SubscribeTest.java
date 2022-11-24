package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import pom_pages.DWS_Subscribe;

public class DWS_SubscribeTest extends Base_Test {
	
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Subscribe");
		return data;
	}
	
	@Test(dataProvider = "TestData")
	public void TC15(String email) {
		DWS_Subscribe sb=new DWS_Subscribe(driver);
		sb.Email(email);
		sb.Button();
	}

}
