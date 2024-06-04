package testTravel101;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import createDrivers.makeDrivers;

public class testTravel {

    public static void main(String[] args) {
        makeDrivers callDrivers = new makeDrivers();
        callDrivers.setupBrowser("firefox", "https://www.easyjet.com/en");

        WebDriverWait wait = new WebDriverWait(callDrivers.getDriver(), Duration.ofSeconds(20));

        // Wait for and close the banner
        wait.until(ExpectedConditions.elementToBeClickable(By.id("ensCloseBanner"))).click();

        // Enter origin
        WebElement originInput = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='origin']")));
        originInput.click();
        originInput.sendKeys("London");

        // Wait for and select the origin from the list
        List<WebElement> origins = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-1 li>a>span")));
        for (WebElement origin : origins) {
            if (origin.getText().contains("Luton")) {
                origin.click();
                break;
            }
        }

        // Enter destination
        WebElement destinationInput = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='destination']")));
        destinationInput.click();
        destinationInput.sendKeys("a");

        // Wait for and select the destination from the list
        List<WebElement> destinations = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#ui-id-2 li>a>span")));
        for (WebElement destination : destinations) {
            if (destination.getText().contains("Antalya")) {
                destination.click();
                break;
            }
        }

        // Close the driver
        callDrivers.getDriver().close();
    }
}
