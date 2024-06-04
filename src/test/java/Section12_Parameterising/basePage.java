package Section12_Parameterising;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class basePage {
	
	public static WebDriver driver;
	public static String url;
	
	
	public WebDriver getDriver() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("/Users/dextertennison/eclipse-workspace/TravelWeb101/src/test/java/Section12_Parameterising/config3.properties");
		
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
		return driver;
	}
	public String getUrl() throws IOException {
		Properties prop = new Properties();
		FileInputStream data = new FileInputStream("/Users/dextertennison/eclipse-workspace/TravelWeb101/src/test/java/Section12_Parameterising/config3.properties");
		prop.load(data);
		url = prop.getProperty("url");
		return url;
	}
	
	

}
