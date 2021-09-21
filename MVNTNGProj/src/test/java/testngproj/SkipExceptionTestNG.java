package testngproj;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipExceptionTestNG {
	
	@Test
	public void skipExceptionUsingTestNG() {
		
		int a = 1,b=2;
		
		if(a>b) {
			throw new SkipException("Skipping the exception using testNG.");// manually skipping the exception using testNG SkipException
		}
	}

}
