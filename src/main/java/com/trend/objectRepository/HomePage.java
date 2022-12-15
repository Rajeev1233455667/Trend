package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.trend.genericUtility.WebDriverUtility;


public class HomePage {
	@FindBy(xpath="//button[text()='Login']")
	private WebElement homeClick;
	//@FindBy(xpath="//div[text()='successfully logged in']")
	//private WebElement successfulloginIcon;
	@FindBy(xpath="//a[text()='Men']")
	private WebElement menIcon;
	@FindBy(xpath="//a[text()='T-shirts']")
	private WebElement tshirt;
	@FindBy(xpath="//a[text()='men tshirt']")
	private WebElement menTshirt;
	@FindBy(xpath="//a[text()='Electronic']")
	private WebElement electronicIcon;
	@FindBy(xpath="//a[text()='Power bank']")
	private WebElement powerBank;
	@FindBy(xpath="//a[text()='Power bank']")
	private WebElement movetopowerBank;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
public void clickOnHomePage() {
	homeClick.click();
}


public  void menAction(WebDriverUtility webDriverUtility) {
	webDriverUtility.mouse_hover_onelement(menIcon);
}
public void clickOnTshirt() {
	tshirt.click();
}
/**
 * this method is used to call the menAction from webDriverUtility to perform actions class 
 * @param webDriverUtility
 */
public  void mentshirtAction(WebDriverUtility webDriverUtility) {
	webDriverUtility.mouse_hover_onelement(menTshirt);
}
/**
 * this method is used to call the menAction from webDriverUtility to perform actions class 
 * @param webDriverUtility
 */
public  void electronicAction(WebDriverUtility webDriverUtility) {
	webDriverUtility.mouse_hover_onelement(electronicIcon);
}
public void clickOnPowerBank() {
	powerBank.click();
}
public  void movetopowerBankAction(WebDriverUtility webDriverUtility) {
	webDriverUtility.mouse_hover_onelement(movetopowerBank);
}
}