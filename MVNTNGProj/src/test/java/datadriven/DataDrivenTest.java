package datadriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/login");
		
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@Test(dataProvider = "Logindata")
	public void login(String username, String password, String status) throws InterruptedException {
		
		WebElement emailfield = driver.findElement(By.id("Email"));
		WebElement passwordfield = driver.findElement(By.id("Password"));
		emailfield.clear();
		passwordfield.clear();
		emailfield.sendKeys(username);
		passwordfield.sendKeys(password);
		driver.findElement(By.cssSelector("button[type$='submit']")).click();
		
		String exp_title = "Dashboard / nopCommerce administration";
		String act_title = driver.getTitle();
		
		if(status.equals("Valid"))
		{
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.linkText("Logout"));
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		} else if(status.equals("Invalid"))
		{
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.linkText("Logout"));
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}

		
	}

	@DataProvider(name = "Logindata")
	public Object[][] getData() {

		Object[][] data = { { "admin@yourstore.com", "admin", "Valid" }, { "admin@yourstore.com", "admin123", "Invalid" },
				{ "admin@yourstore.com", "admin@123", "Invalid" }, };
		return data;

	}

}