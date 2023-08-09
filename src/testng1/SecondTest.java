package testng1;

import org.testng.annotations.Test;

public class SecondTest {
	@Test
	public void Tom() {
		System.out.println("I am Tom");
	}

	@Test
	public void Jerry() {
		System.out.println("I am Jerry");
	}

	@Test(groups = "smoke")
	public void sairat() {
		System.out.println("Sairat.");
	}

	@Test(groups = "smoke")
	public void padmavat() {
		System.out.println("Padmavat.");
	}
}
