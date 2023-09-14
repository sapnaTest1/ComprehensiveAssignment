package com.qa.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_MakeMyTrip_002 extends TestBase {
@Test(priority = 1)
public void CheckFlightsFromToCity() throws InterruptedException, IOException {
driver.navigate().refresh();
driver.navigate().refresh();
//driver.navigate().refresh();
MakeMyTripPagesOR.getFlightsButton().click();
Thread.sleep(2000);
if (driver.getCurrentUrl().contains("flights")) {
Assert.assertTrue(true);
} else {
captureScreenshot(driver, "CheckFlightsFromToCity");
Assert.assertTrue(false, "Flights is not available");
}
MakeMyTripPagesOR.getFlightsOneWay().click();
MakeMyTripPagesOR.getFromCity().click();
MakeMyTripPagesOR.getFromCityInputBox().sendKeys("Salem");
Thread.sleep(1000);
for (int i = 0; i < MakeMyTripPagesOR.getCitySuggestions().size(); i++) {
if (MakeMyTripPagesOR.getCitySuggestions().get(i).getText().contains("Salem")) {
MakeMyTripPagesOR.getCitySuggestions().get(i).click();
}
}
if (MakeMyTripPagesOR.getFromCity().getAttribute("value").contains("Salem")) {
Assert.assertTrue(true);
} else {
captureScreenshot(driver, "CheckFlightsFromToCity");
Assert.assertTrue(false, "From City is not selected");
}
MakeMyTripPagesOR.getToCity().click();
MakeMyTripPagesOR.getToCityInputBox().sendKeys("Chennai");
Thread.sleep(1000);
for (int i = 0; i < MakeMyTripPagesOR.getCitySuggestions().size(); i++) {
if (MakeMyTripPagesOR.getCitySuggestions().get(i).getText().contains("Chennai")) {
MakeMyTripPagesOR.getCitySuggestions().get(i).click();
}
}
Thread.sleep(1000);
if (MakeMyTripPagesOR.getToCity().getAttribute("value").contains("Chennai")) {
Assert.assertTrue(true);
} else {
captureScreenshot(driver, "CheckFlightsFromToCity");
Assert.assertTrue(false, "To City is not selected");
}
}
}