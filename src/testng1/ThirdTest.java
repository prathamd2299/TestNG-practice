package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThirdTest {
	@BeforeSuite
	public void BS() {
		System.out.println("This code executes before the suite ");
	}

	@AfterSuite
	public void AS() {
		System.out.println("This code executes after the suite ");
	}

	@BeforeTest
	public void BT() {
		System.out.println("This code executes before the test ");
	}

	@AfterTest
	public void AT() {
		System.out.println("This code executes after the test ");
	}

	@BeforeClass
	public void BC() {
		System.out.println("This code executes before the class ");
	}

	@AfterClass
	public void AC() {
		System.out.println("This code executes after the class ");
	}

	@BeforeMethod
	public void BM() {
		System.out.println("This code executes before the method ");
	}

	@AfterMethod
	public void AM() {
		System.out.println("This code executes after the method ");
	}

	@Test
	public void doremon() {
		System.out.println("I am Doremon");
	}
}
