package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNG {

	// Hard assertion
	@Test
	public void assertion1() {
		Assert.assertEquals("prat", "prat");
		System.out.println("pass");
	}

	// Soft assertion
	@Test
	public void assertion2() {
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(10, 23);
		System.out.println("pass");
	}
}
