package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import pom_pages.DWS_Homepage;
import pom_pages.DWS_LoginPage;

public class DWS_Login_Test extends Base_Test {
	@Test
	public void TC01() {
		DWS_Homepage hp=new DWS_Homepage(driver);
		hp.Click_Login();
		
		DWS_LoginPage lp=new DWS_LoginPage(driver);
		lp.Enter_username("chaithuuk1712@gmail.com");
		lp.Enter_Password("9380771322");
		lp.Click_Login();
	}
	

}
