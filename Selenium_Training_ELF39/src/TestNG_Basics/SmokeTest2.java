package TestNG_Basics;

import org.testng.annotations.Test;

public class SmokeTest2 {
	@Test(groups = "SmokeTest")
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	@Test
	public void Logout() {
		System.out.println("Executing Logout TC");
	}
}
