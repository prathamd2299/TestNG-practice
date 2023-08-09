package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	@Test
	@Parameters({"username","password"})
	public void salesforce(String s1, String s2) {
		System.out.println(s1 + " " + s2);
	}
}
