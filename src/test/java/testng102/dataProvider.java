package testng102;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import createDrivers.makeDrivers;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class dataProvider {
	WebDriver driver;

	@BeforeSuite

	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];

		// data set 1
		data[0][0] = "test@test.com";
		data[0][1] = "test123";

		// data set 2
		data[1][0] = "test@test.com";
		data[1][1] = "test123";

		// data set 3
		data[2][0] = "test1@test.com";
		data[2][1] = "test1623";

		return data;
	}

	@Test(dataProvider= "getData")
	public void signin(String email, String password) throws InterruptedException {
		System.out.println("before sigin method starting...");

		driver.get("https://teststore.automationtesting.co.uk/index.php");
		driver.findElement(By.cssSelector(
				"body.lang-en.country-us.currency-usd.layout-full-width.page-index.tax-display-disabled:nth-child(2) nav.header-nav div.container div.row div.hidden-sm-down div.col-md-7.right-nav div:nth-child(1) div.user-info > a:nth-child(1)"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#field-email")).sendKeys(email);
		driver.findElement(By.cssSelector("#field-password")).sendKeys(password);
		driver.findElement(By.cssSelector("#submit-login")).click();

		System.out.println("User has logged in");

	}
	
	@AfterMethod
	public void signOut() throws InterruptedException {
		System.out.println("After signOut method starting...");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".hidden-sm-down.logout")).click();
		System.out.println("User has logged out");
	}


	@AfterSuite
	public void end() {
		System.out.println("After Suite end starting...");
		driver.close();
		driver.quit();
		System.out.println("All browsers are closed");
	}

}
