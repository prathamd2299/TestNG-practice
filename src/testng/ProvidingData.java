package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ProvidingData {
	@Test(dataProvider = "testData")
	public void method(String un,String pwd)
	{
		System.out.println(un + " " + pwd);
	}
	
	@DataProvider
	public Object[][] testData()
	{
		Object [][] data = new Object[2][2];
		data[0][0] = "pratham";
		data[0][1] = "pratham@123";
		data[1][0] = "prat";
		data[1][1] = "pratham@123";
		return data;
	}
}


