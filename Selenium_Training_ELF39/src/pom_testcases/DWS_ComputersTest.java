package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import pom_pages.DWS_Homepage;

public class DWS_ComputersTest extends Base_Test {
	
	@Test
	public void TC07() {
		DWS_Homepage hp=new DWS_Homepage(driver) ;
			hp.Mouse_Hover_On_Computer();
			hp.Hover_On_Accesories();

		
	}

}
