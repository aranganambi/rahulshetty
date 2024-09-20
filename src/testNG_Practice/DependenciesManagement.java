package testNG_Practice;

import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test(enabled = false)
	public void login() {
	System.out.println("Login With Valid Credentials");
	}
	@Test(dependsOnMethods = "login")
	public void dashboard() {
	System.out.println("Go To The Dashboard");
	}
	@Test(dependsOnMethods = "dashboard")
	public void addToCart() {
	System.out.println("Add Product Into My Cart");
	}
	@Test(dependsOnMethods = "addToCart")
	public void profile() {
	System.out.println("Go To The Profile");
	}
	@Test(dependsOnMethods = "profile", enabled = true)
	public void logout() {
	System.out.println("Logout The User");
	}
}
