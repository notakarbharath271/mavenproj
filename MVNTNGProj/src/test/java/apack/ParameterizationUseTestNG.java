package apack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationUseTestNG {

	WebDriver driver;

	@Parameters({ "URL" })
	@Test(priority = 1)
	public void setUpForLanchingBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);

	}

	@Test(priority = 2)
	@Parameters({ "USERNAME", "PASSWORD" })
	public void login(String userName, String psword) {
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		driver.findElement(By.linkText("Login")).click();

		driver.findElement(By.id("input-email")).sendKeys(userName);

		driver.findElement(By.id("input-password")).sendKeys(psword);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
