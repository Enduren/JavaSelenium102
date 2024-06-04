package iframe101;

import org.openqa.selenium.By;

import createDrivers.makeDrivers;

public class testIframe101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeDrivers callDrivers = new makeDrivers();
		callDrivers.setupBrowser("firefox", "https://www.automationtesting.co.uk/iframes.html");

		callDrivers.getDriver().switchTo().frame(0);

		callDrivers.getDriver().findElement(By.cssSelector(".toggle")).click();

		callDrivers.getDriver().switchTo().parentFrame();

		callDrivers.getDriver().switchTo().frame(1);

		callDrivers.getDriver().findElement(By.cssSelector("button[title='Play']")).click();
		callDrivers.getDriver().close();

	}

}
