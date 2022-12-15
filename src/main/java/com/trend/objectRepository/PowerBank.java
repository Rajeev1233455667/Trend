package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PowerBank {
	@FindBy(xpath="//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedPrimary MuiButton-sizeSmall MuiButton-outlinedSizeSmall  css-k58djc']")
	private WebElement powerBank;
	public PowerBank(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
     * this method is used to clickPowerbank
     * @param mail
     */
	public void clickPowerBank() {
		powerBank.click();
	}
}
