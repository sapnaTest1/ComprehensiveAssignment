package com.qa.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_MakeMyTrip_001 extends TestBase{
   @Test
   public void checkLogo() throws IOException, InterruptedException {
  /*
     Thread.sleep(4000);
    driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
    driver.getPageSource();
     WebElement element = MakeMyTripPagesOR.getPopupClose();
     element.click();
     */
  driver.navigate().refresh();
  driver.navigate().refresh();
  if(MakeMyTripPagesOR.getMakeMyTripLogo().isDisplayed())
  {
  Assert.assertTrue(true);
  }
  else {
  captureScreenshot(driver, "checkLogo");
  Assert.assertTrue(false,"MakeMyTrip logo is not present on the Page");
  }
   }
}
