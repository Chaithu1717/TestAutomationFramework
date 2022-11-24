package pom_testcases;

import org.testng.annotations.Test;

import FrameWork_Utility.Base_Test;

public class DWS_CommunityPoll extends Base_Test{
	
	@Test
	public void TC06() {
		pom_pages.DWS_CommunityPoll poll=new pom_pages.DWS_CommunityPoll(driver);
		poll.Excellent();
		poll.Vote_btn();
	}

}
