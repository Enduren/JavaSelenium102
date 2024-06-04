package Section12_Parameterising;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login5 extends basePage2{
	
	

	public Login5() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void signin() throws InterruptedException, IOException {
		
		driver = getDriver();
		driver.get(getUrl());

		driver.findElement(By.cssSelector("[title] .hidden-sm-down")).click();
		driver.findElement(By.cssSelector("section input[name='email']")).sendKeys("test@test.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("test123");
		driver.findElement(By.cssSelector("button#submit-login")).click();

	

		System.out.println("user has logged in");
		Thread.sleep(2000);
		driver.close();
	}

}
