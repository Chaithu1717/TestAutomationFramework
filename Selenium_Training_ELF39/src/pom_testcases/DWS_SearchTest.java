package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import pom_pages.DWS_Search;

public class DWS_SearchTest extends Base_Test {
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Search");
		return data;
		
	}
	
	@Test(dataProvider = "TestData")
	public void TC13(String item) {
//		DWS_Homepage hp=new DWS_Homepage(driver);
//		hp.Search();
		
		DWS_Search sr=new DWS_Search(driver);
		sr.Search_Text_Field(item);
		
		sr.Search_button();
	}
}
