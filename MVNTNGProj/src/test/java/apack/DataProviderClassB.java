package apack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClassB {
	
	@Test(dataProvider = "getData")
	public void loginTest(String username,String password) {
		System.out.println("Login got sucessful when we provide the username "+username+" and password "+password);
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Bharath";
		data[0][1] = "123456";
		
		data[1][0] = "Satheesh";
		data[1][1] = "852461";
		
		data[2][0] = "Lavanya";
		data[2][1] = "845962";
		
		return data;
		
	}
	
}
