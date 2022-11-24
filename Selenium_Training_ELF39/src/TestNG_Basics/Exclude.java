package TestNG_Basics;

import org.testng.annotations.Test;

public class Exclude {
	@Test
	public void Register() {
	System.out.println("Executing Register TC");
	}
	@Test
	public void Login() {
		System.out.println("Executing Login TC");
	}
	@Test
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
