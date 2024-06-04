package Section12_Parameterising;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class basePage2 {
	
	public static WebDriver driver;
	private  String url;
	private Properties prop;
	
public basePage2() throws IOException {
	prop = new Properties();
	FileInputStream data = new FileInputStream(
			System.getProperty("user.dir") + "/src/test/java/Section12_Parameterising/config3.properties");
			
	
	prop.load(data);
	}
	
	public WebDriver getDriver() throws IOException {	
		
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
		
		url = prop.getProperty("url");
		return url;
	}
	
	

}
