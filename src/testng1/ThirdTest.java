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

	@Test
	public void testCase1() {
		System.out.println("This is Test Case 1");
	}

	@Test
	public void testCase2() {
		System.out.println("This is Test Case 2");
	}

	// methods under this annotation will be executed prior to each method in each
	// test case.
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every Test Method");
	}

	// methods under this annotation will be executed after each method in each test
	// case.
	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every Test Method");
	}

	// The annotated method will be run before the first test method in the current
	// class is invoked. It runs only once per class.
	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class");
	}

	// The annotated method will be run after all the test methods in the current
	// class have been run.
	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the Class");
	}

	// methods under this annotation will be executed prior to the first test case
	// in the TestNG file.
	// The annotated method will run before any test method belonging to the classes
	// inside the <test> tag is run.
	@BeforeTest
	public void beforeTest() {
		System.out.println("This method will be executed before each test case");
	}

	// methods under this annotation will be executed after all test cases in the
	// TestNG file are executed.
	// The annotated method will run after all the test methods belonging to the
	// classes inside the <test> tag have run.
	@AfterTest
	public void afterTest() {
		System.out.println("This method will be executed after each test case");
	}

	// The annotated method will run only once before all tests in this suite have
	// run.
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute before the Test Suite");
	}

	// The annotated method will run only once after all tests in this suite have
	// run.
	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after the Test Suite");
	}
}
