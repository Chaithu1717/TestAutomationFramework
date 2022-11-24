package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import pom_pages.DWS_Homepage;

public class DWS_LinkTest  extends Base_Test{
	
	@Test
	public void TC12() {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.Links();
	}
	}
	
