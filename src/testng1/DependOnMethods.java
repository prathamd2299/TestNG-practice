package testng1;

import org.testng.annotations.Test;

public class DependOnMethods {
	
	@Test(dependsOnMethods = "M2")
	public void M1()
	{
		System.out.println("method M1");
	}
	
	@Test
	public void M2()
	{
//		System.out.println("Method M2");
		String s = "pratham";
		System.out.println(s.charAt(1));
	}
}
