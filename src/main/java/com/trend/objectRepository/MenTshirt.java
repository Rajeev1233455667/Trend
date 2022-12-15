package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenTshirt {
	@FindBy(xpath="//span[text()='Levis Mens Regular Fit Tee']/../../../descendant::button[text()='add to cart']")
	private WebElement menTshirt;
	public MenTshirt(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
     * this method is used to click on mentshirt
     * @param mail
     */
	public void clickOnMenTshirt() {
		menTshirt.click();
	}

}
