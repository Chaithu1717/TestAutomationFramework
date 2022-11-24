package TestNG_Basics;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 1)
	public void Register() {
	System.out.println("Executing Register TC");
}
	@Test(priority = 2)
	public void Login() {
		System.out.println("Executing Login TC");
	}
	@Test(priority = 3)
	public void Search() {
		System.out.println("Executing Search tc");
	}
	@Test(priority = 4)
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	@Test(priority = 5)
	public void Logout() {
		System.out.println("Executing Logout TC");
	}
}
