package testng102;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng102.ItestListener102.class)

public class ItestListener101 {
	WebDriver driver;

	@BeforeSuite

	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(
				"https://teststore.automationtesting.co.uk/index.php?controller=authentication?back=https%3A%2F%2Fteststore.automationtesting.co.uk%2Findex.php");

		Thread.sleep(2000);

	}

	@Test 
	public void enterEmail() throws InterruptedException {
		Assert.fail();
		driver.findElement(By.cssSelector("#field-email")).sendKeys("test@test.com");
		Thread.sleep(2000);
		
	}

	@Test
	public void enterPassword() throws InterruptedException {
		driver.findElement(By.cssSelector("#field-password")).sendKeys("test123");
		Thread.sleep(2000);
		
	}
	
	
	
	@AfterSuite
	public void end() {
		System.out.println("After Suite end starting...");
		driver.close();
		driver.quit();
		System.out.println("All browsers are closed");
	}
}
