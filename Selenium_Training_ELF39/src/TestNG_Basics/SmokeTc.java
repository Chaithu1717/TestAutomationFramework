package TestNG_Basics;

import org.testng.annotations.Test;

public class SmokeTc {
	@Test(groups = "SmokeTest")
	public void Register() {
	System.out.println("Executing Register TC");
	}
	@Test(groups = "SmokeTest")
	public void Login() {
		System.out.println("Executing Login TC");
	}
	@Test(groups = "SmokeTest")
	public void Search() {
		System.out.println("Executing Search tc");
	}
	@Test
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	@Test
	public void Logout() {
		System.out.println("Executing Logout TC");
	}
}
