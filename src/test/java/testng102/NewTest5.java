package testng102;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import createDrivers.makeDrivers;

import org.testng.annotations.BeforeMethod;

import java.time.Duration;

//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class NewTest5 {
  @Test(groups= {"smoke","regression"})
  public void firstTest() {
	  System.out.println("smoke and regression");
	  System.out.println("test1.5");
  }
  
  @Test(groups= {"smoke"})
  public void secondTest() {
	  System.out.println("smoke");
	  System.out.println("test2.5");
  }
 
 

}
