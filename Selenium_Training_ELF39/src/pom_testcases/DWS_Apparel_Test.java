package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import pom_pages.DWS_Apparel_Shoes;
import pom_pages.DWS_Homepage;

public class DWS_Apparel_Test  extends Base_Test{
	@Test
	public void TC04() {
	
	DWS_Homepage hp=new DWS_Homepage(driver);
	hp.Apparel();
	
	DWS_Apparel_Shoes as=new DWS_Apparel_Shoes(driver);
	as.Add();

}
}
