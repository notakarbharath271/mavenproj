package testngproj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDemo {

	@Test
	public void sampleTestNG() {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();

		Assert.assertTrue(driver.findElement(By.id("welcome")).isDisplayed());

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//a//b[text()='Admin']"))).build().perform();

		a.moveToElement(driver.findElement(By.xpath("//a[text()='User Management']"))).build().perform();

		a.click(driver.findElement(By.linkText("Users"))).build().perform();

		String actualtext = driver.findElement(By.xpath("//h1[text()='System Users']")).getText();

		Assert.assertEquals(actualtext, "System Users");

		System.out.println(driver.findElements(By.xpath("//table[@class='table hover']//th")).size());

		int checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(checkboxes);

		List<WebElement> chkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for (int i = 1; i <checkboxes; i++) {

				if (i % 2 == 0) {
					chkbox.get(i).click();
					
			}
		}
		
		String usersxpath ="//table//tr//td[2]";
		String roleOfUsersxpath = "//table//tr//td[3]";
		
		int noOfusernames = driver.findElements(By.xpath("//table//tr//td[2]")).size();
		
		List<WebElement> usernames = driver.findElements(By.xpath("//table//tr//td[2]"));
		
		for(int j = 1;j<noOfusernames;j++) {
			if(j%2!=0) {
		
				System.out.println(j+":"+usernames.get(j).getText());
			}
		}
		
		//driver.quit();

	}

}
