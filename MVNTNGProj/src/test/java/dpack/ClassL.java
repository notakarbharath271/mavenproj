package dpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class ClassL {

	@Parameters({ "URL" })
	@Test
	public void setup(String url) {
		//Execution starts here
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		int a = 2, b = 5, c = 9;

		if (a == 1) {
			Assert.assertTrue(b < c);
		} else if (a == 2) {
			Assert.assertTrue(b > c);
		} else if (a == 3) {
			throw new SkipException("TestSkipped");
		}
		driver.close();
	}
	//Execution ends here.
}
