package testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FourthTest {

	// launchbrowser
	// enter url
	// verify login
	// close browser
	//It will execute the methods in alphabetical order
	//It will execute the methods in ascending order
	//It will execute the methods in ascending order ASCII value 
	@Test
	public void launchBrowser() {
		System.out.println("Launched the browser...");
	}

	@Test(priority = 1)
	public void enterUrl() {
		System.out.println("Entering the proper url...");
	}

	@Test
	public void verifyLogin() {
		System.out.println("Enter the valid credentials...");
	}

	@Test(priority = 4)
	public void closeBrowser() {
		System.out.println("Close the browser..");
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
}
