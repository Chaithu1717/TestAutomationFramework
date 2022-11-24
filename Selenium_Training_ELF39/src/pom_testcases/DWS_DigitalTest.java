package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import pom_pages.DWS_Digital;
import pom_pages.DWS_Homepage;

public class DWS_DigitalTest  extends Base_Test{
	
	@Test
	public void TC09() {
		DWS_Homepage HP=new DWS_Homepage(driver);
		HP.Digital();
		
		DWS_Digital dt=new DWS_Digital();
		dt.Cart();
	}

}
