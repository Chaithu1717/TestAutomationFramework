package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;
import pom_pages.DWS_Homepage;

public class DWS_BookTest extends Base_Test{
	@Test
	public void TC05() {
	DWS_Homepage hp=new DWS_Homepage(driver);
	hp.book_click();
	}
	}
