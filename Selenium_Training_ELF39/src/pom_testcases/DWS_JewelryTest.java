package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import pom_pages.DWS_Homepage;
import pom_pages.DWS_Jewelry;

public class DWS_JewelryTest extends Base_Test {
	
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Jewelry");
		return data;
		
	}
	
	@Test(dataProvider="TestData")
	public void TC11(String sortby,String page,String view) {
		DWS_Homepage hp=new DWS_Homepage(driver) ;
		hp.Jewelry();
	
		
		DWS_Jewelry je=new DWS_Jewelry(driver);
		je.Sort_By(sortby);
		je.Page_Size(page);
		je.View(view);
	}
}


