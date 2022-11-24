package TestNG_Basics;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void Register() {
	System.out.println("Executing Register TC");
}
	@Test(dependsOnMethods = "Register")
	public void Login() {
		System.out.println("Executing Login TC");
	}
	@Test(dependsOnMethods = "Login")
	public void Search() {
		System.out.println("Executing Search tc");
	}
	@Test(dependsOnMethods = "Search")
	public void Wishlist() {
		System.out.println("Executing Wishlist TC");
	}
	@Test(dependsOnMethods = "Wishlist")
	public void Logout() {
		System.out.println("Executing Logout TC");
	}
}
