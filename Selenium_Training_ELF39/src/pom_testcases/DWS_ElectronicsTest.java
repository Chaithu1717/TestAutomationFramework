package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import pom_pages.DWS_Electronics;
import pom_pages.DWS_Homepage;


public class DWS_ElectronicsTest extends Base_Test {
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Electronics");
		return data;
	}
	
	@Test(dataProvider = "TestData")
	public void TC09(String friend,String your) {
	DWS_Homepage hp=new DWS_Homepage(driver);
	hp.Electronic();
	
	DWS_Electronics el =new DWS_Electronics(driver);
	el.Camera();
	el.Cam();
	el.Email_btn();
	el.Friend(friend);
	el.Your(your);
	el.Submit();
	
	
	}
}
