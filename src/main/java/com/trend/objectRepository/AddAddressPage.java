package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAddressPage {
	@FindBy(xpath="//button[text()='Add Address']") private WebElement myAddress;
	public AddAddressPage(WebDriver driver) {
		/**
		 * initilize the object
		 */
		PageFactory.initElements(driver, this);
	}
	/**
	 * clickoOnMyAdress()method is used to click on myaddress button
	 */
	public void clickOnMyAdress() {
		myAddress.click();
	}
}


