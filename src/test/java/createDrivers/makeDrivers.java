package createDrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class makeDrivers {
private WebDriver driver; // Change visibility to private
    
    public WebDriver getDriver() {
        return driver;
    }


	 public void setupBrowser(String browser, String url) {
	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        } else if (browser.equalsIgnoreCase("safari")) {
	            driver = new SafariDriver();
	        } else {
	            System.out.println("please choose from: chrome, firefox, edge, or safari");
	            System.exit(0);
	        }
	        
	        if (url != "") {
	            driver.get(url);
	        } else {
	            driver.get("about.blank");
	        }
	     // Set implicit wait to 10 seconds
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.manage().window().maximize();
	 }
}
