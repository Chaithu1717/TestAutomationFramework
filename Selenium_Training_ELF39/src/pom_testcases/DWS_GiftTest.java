package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import pom_pages.DWS_GiftCard;
import pom_pages.DWS_Homepage;

public class DWS_GiftTest extends Base_Test {
	
	@Test
	public void TC10() {
	
	DWS_Homepage hp=new DWS_Homepage(driver);
	hp.Gift();
	
	DWS_GiftCard gc=new DWS_GiftCard(driver);
	gc.Cart();
	}
}
