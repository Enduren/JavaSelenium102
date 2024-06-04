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

public class Login2 {

	WebDriver driver;

	@BeforeSuite

	public void setup() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("/Users/dextertennison/eclipse-workspace/TravelWeb101/src/test/java/Section12_Parameterising/config2.properties");
		
		prop.load(data);
		
		
		if(prop.getProperty("browser").equals("chrome")) {		
			driver = new ChromeDriver();
		}else if(prop.getProperty("browser").equals("firefox")){
			 driver = new FirefoxDriver();
		}else if(prop.getProperty("browser").equals("safari")){
			driver = new SafariDriver();
		}else {
            System.out.println("please choose from: chrome, firefox, edge, or safari");
            System.exit(0);
        }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		
		
		driver.get(prop.getProperty("url"));

	}

	@Test
	public void signin() throws InterruptedException {
		System.out.println("before sigin method starting...");

		
		driver.findElement(By.cssSelector(
				"body.lang-en.country-us.currency-usd.layout-full-width.page-index.tax-display-disabled:nth-child(2) nav.header-nav div.container div.row div.hidden-sm-down div.col-md-7.right-nav div:nth-child(1) div.user-info > a:nth-child(1)"))
				.click();

		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#field-email")).sendKeys("test@test.com");
		driver.findElement(By.cssSelector("#field-password")).sendKeys("test123");
		driver.findElement(By.cssSelector("#submit-login")).click();

		System.out.println("User has logged in");
		driver.close();

	}

}
