package testng1;

import org.testng.annotations.Test;

public class GroupsAtt {
	@Test(groups = "regression")
	public void bajiraoMastani() {
		System.out.println("Bajirao Mastani.");
	}

	@Test(groups = "regression")
	public void mr_India() {
		System.out.println("Mr. India.");
	}

}
