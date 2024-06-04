package iframe101;

import java.util.ArrayList;

import org.openqa.selenium.By;

import createDrivers.makeDrivers;

public class testbrowser101 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		makeDrivers callDrivers = new makeDrivers();
		callDrivers.setupBrowser("firefox", "https://www.automationtesting.co.uk/");

		callDrivers.getDriver()
				.findElement(
						By.cssSelector("div.inner nav:nth-child(1) ul:nth-child(2) li:nth-child(4) > a:nth-child(1)"))
				.click();
		for (int i = 0; i < 3; i++) {
			callDrivers.getDriver().findElement(By.cssSelector("div.inner:nth-child(1) div.row:nth-child(5) div.col-4.col-12-medium form:nth-child(3) > input:nth-child(1)")).click();
			
		}
		
		ArrayList<String> windowsHandles = new ArrayList<String>(callDrivers.getDriver().getWindowHandles());
		
		System.out.println("There are " + windowsHandles.size() + " tabs open");
		
		for (String item : windowsHandles) {
			Thread.sleep(1000);
			callDrivers.getDriver().switchTo().window(item);
		}
		Thread.sleep(1000);
		callDrivers.getDriver().switchTo().window(windowsHandles.get(0));
		
		callDrivers.getDriver().quit();
//		callDrivers.getDriver().getWindowHandle().sw
	}

}
