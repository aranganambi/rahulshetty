package testNG_Practice;

import org.testng.annotations.Test;

public class PrioritAndSkip {

	@Test(priority = 0)
	public void startACar() {
		System.out.println("Start The Car");
	}
	
	@Test(priority = 1,enabled = false) //Skip
	public void putFirstGear() {
		System.out.println("Put First Gear");
	}
	
	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("Put Second Gear");
	}
	
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("Put Third Gear");
	}

	@Test(priority = 4)
	public void putFourthGear() {
		System.out.println("Put Fourth Gear");
	}
}
