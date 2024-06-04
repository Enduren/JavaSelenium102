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

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class Annotations {
	WebDriver driver;

	@BeforeSuite

	public void setup() throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}

	@Test
	public void openWebsite() {
		// TODO Auto-generated method stub
		driver.get("https://www.automationtesting.co.uk/");

	}

	@AfterSuite
	public void end() {
		driver.close();
		driver.quit();
	}

}
