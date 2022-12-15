package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class AddAddresssPage {
	
		@FindBy(xpath="//input[@value='Home']")
		private WebElement homebutton;
		@FindBy(xpath="//input[@placeholder='John Doe']")
		private WebElement nameField;
		@FindBy(xpath="//input[@placeholder=\"eg-142/87, ABC Apartment\"]")
		private WebElement houseField;
		@FindBy(xpath="//input[@placeholder=\"eg-4th streetInfo\"]")
		private WebElement streetField;
		@FindBy(xpath="//input[@placeholder=\"eg-near This and That\"]")
		private WebElement landField;
		@FindBy(xpath="//option[text()='Country']/parent::select")
		private WebElement countryDropDown;
		@FindBy(xpath="//option[text()='State']/parent::select[@id='demo-simple-select-placeholder-label']")
		private WebElement stateDropDown;
		@FindBy(xpath="//option[text()='City']/parent::select[@id='demo-simple-select-placeholder-label']")
		private WebElement cityDropDown;
		//@FindBy(xpath="//input[@placeholder='9876543210']")
		//private WebElement phoneNumber;

		@FindBy(xpath="//input[@placeholder='9876543210']")
		private WebElement phoneNumber;
		@FindBy(xpath="//button[text()='Add Address']")
		private WebElement addAddressButton;
		
		
     public  AddAddresssPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
     /*
      * this method is used click on home button
      */
		public void addAddresssHome() {
			homebutton.click();
		}
		/*
		 * this method is use for send the name
		 * @param name
		 */
		public void addAddresssName(String name) {
			nameField.sendKeys(name);
		}
		/**
		 * this method is use for send the value of house
		 * @param house
		 */
		public void addAddresssHouse(String house) {
			houseField.sendKeys(house);
		}
		/**
		 * this method is use for send the value of street
		 * @param house
		 */
		public void addAddresssStreet(String street) {
			streetField.sendKeys(street);
		}
		/**
		 * this method is use for send the value of land
		 * @param house
		 */
		public void addAddresssLand(String landmark) {
			landField.sendKeys(landmark);
		}
		/**
		 * this method is use for drop down
		 * @param house
		 */
	    public WebElement countryList()
	    {
	    return countryDropDown;	
	    }
		
		
		
		
		
	
		

}
