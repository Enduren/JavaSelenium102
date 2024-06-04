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

public class NewTest6 {
  @Test(groups= {"smoke","regression"})
  public void firstTest() {
	  System.out.println("smoke and regression");
	  System.out.println("test1.6");
  }
  
  @Test(groups= {"smoke"})
  public void secondTest() {
	  System.out.println("smoke");
	  System.out.println("test2.6");
  }
  
  @Test(groups= {"regression"})
  public void thirdTest() {
	  System.out.println("regression");
	  System.out.println("test3.6");
  }
 
 

}
