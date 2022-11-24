package pom_testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import FrameWork_Utility.Utility_Methods;
import pom_pages.DWS_AdvanceSearch;
import pom_pages.DWS_Search;

public class DWS_AdvanceSearchTest  extends Base_Test{
	
	@DataProvider(name = "TestData")
	public Object[][] testdata() throws IOException{
		Object[][] data=Utility_Methods.getTestData("Advance");
		return data;
	}
	
	@Test(dataProvider = "TestData")
	public void TC03(String item,String category,String manufacture,String from,String to) {
		
			DWS_Search sr=new DWS_Search(driver) ;
			sr.Search_Text_Field(item);	
			sr.Search_button();
			sr.Advance_Search();
			
			DWS_AdvanceSearch ad=new DWS_AdvanceSearch(driver);
			ad.Category(category);
			ad.Auto_Click();
			ad.Manufacture(manufacture);
			ad.From(from);
			ad.To(to);
			
	}
	
	

}
