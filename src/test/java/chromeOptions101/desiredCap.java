package chromeOptions101;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class desiredCap extends chromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*"); // workaround for not released up to date chromedriver
		options.setPageLoadStrategy(PageLoadStrategy.EAGER); // workaround for cookie timeouts
		options.addArguments("--start-maximized"); // start with maximized window
		options.setAcceptInsecureCerts(true); // accept insecure certificates

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://expired.badssl.com/");

	}

}
