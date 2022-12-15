package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	@FindBy(xpath="//div[text()='My Addresses']") private WebElement addAddress;
	public ProfilePage(WebDriver driver) {
		/**
		 * initilize the object
		 */
		PageFactory.initElements(driver, this);
	}
	/**
     * this method is used to click on myaddress
     * @param mail
     */
	public void clickOnMyAdress() {
		addAddress.click();
	}
}

