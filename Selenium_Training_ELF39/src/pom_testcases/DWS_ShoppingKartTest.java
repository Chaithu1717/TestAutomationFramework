package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import pom_pages.DWS_Homepage;

public class DWS_ShoppingKartTest extends Base_Test {

	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Kart");
		return data;
	}
	@Test(dataProvider = "TestData")
	public void TC14(String country,String code) {
		
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.Kart();
	
	}
}
