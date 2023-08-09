package testng;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount = 10)
	public void loop()
	{
		System.out.println("I love my India....");
	}
}
