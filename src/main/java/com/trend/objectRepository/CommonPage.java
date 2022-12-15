package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPage {
@FindBy(xpath="//a[text()='Electronic']")private WebElement Electronic;
@FindBy(xpath="//a[text()='Men']")private WebElement Men;
@FindBy(xpath="//div[@class='MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault css-bjoz8z']")private WebElement Setting;
@FindBy(xpath="//li[text()='My Profile']") private WebElement profileTextField;
@FindBy(xpath="//a[@class='navbar_cartIcon__Lqbph']")
private WebElement Cart;


public CommonPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
/**
 * this method is use for click on electronic
 * @param house
 */
public void clickElectronic() {
	Electronic.click();
}/**
 * this method is use for click on setting button
 * @param house
 */
public void clickSetting() {
	Setting.click();
}/**
 * this method is use for click on profile button
 * @param house
 */
public void clickOnProfile() {
	profileTextField.click();
}
public void clickOnCart() {
	Cart.click();
}

}


