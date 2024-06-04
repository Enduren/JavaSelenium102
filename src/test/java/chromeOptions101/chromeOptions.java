package chromeOptions101;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub https://testng.org/testng-eclipse-update-site/7.4.0
		

		ChromeOptions options= new ChromeOptions();
		
		options.addArguments("--start-maximized");
		
		options.addArguments("--incognito");
		WebDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		
		
		driver.get("https://www.automationtesting.co.uk/");
		
		//driver.close();

	}

}
