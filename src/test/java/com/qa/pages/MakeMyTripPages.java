package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakeMyTripPages {
WebDriver driver;

@FindBy(xpath = "//a[@id='webklipper-publisher-widget-container-notification-close-div']")

WebElement PopupClose;
public WebElement getPopupClose() {
return PopupClose;
}

    @FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div[1]/a/picture/img")
    WebElement MakeMyTripLogo;
    public WebElement getMakeMyTripLogo() {
    return MakeMyTripLogo;
    }
   
    @FindBy(xpath="//*[@class='chNavText darkGreyText']")
    WebElement FlightsButton;
    public WebElement getFlightsButton() {
    return FlightsButton;
    }
   
    @FindBy(xpath = "(//*[starts-with(@class,'tabsCircle')])[1]")
    WebElement FlightsOneWay;
    public WebElement getFlightsOneWay() {
    return FlightsOneWay;
    }
   
    @FindBy(xpath="//input[contains(@id,'fromCity')]")
    WebElement FromCity;
    public WebElement getFromCity() {
    return FromCity;
    }
   
    @FindBy(xpath="//input[@placeholder='From']")
    WebElement FromCityInputBox;
    public WebElement getFromCityInputBox() {
    return FromCityInputBox;
    }
   
    @FindAll(@FindBy(xpath="//div[@class='calc60']"))
    List<WebElement> CitySuggestions;
    public List<WebElement> getCitySuggestions(){
    return CitySuggestions;
    }
   
    @FindBy(xpath ="//input[contains(@id,'toCity')]")
    WebElement ToCity;
    public WebElement getToCity() {
    return ToCity;
    }
   
    @FindBy(xpath ="//input[@placeholder='To']")
    WebElement ToCityInputBox;
    public WebElement getToCityInputBox() {
    return ToCityInputBox;
    }
   
   
    public MakeMyTripPages(WebDriver rDriver) {
this.driver = rDriver;
PageFactory.initElements(rDriver, this);
}
}