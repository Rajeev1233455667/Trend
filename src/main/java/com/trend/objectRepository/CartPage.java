package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class CartPage {
	@FindBy(xpath="//h3[text()='levis']")
	private WebElement selectedinCart;
	@FindBy(xpath="//span[text()='ubon pb x90']")
	private WebElement selectedinCartPowerBank;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void selectCart() {
		String actual = selectedinCart.getText();
		String Expected="levis";
	/*	  if(actual.equals(Expected))
	        {
	        	System.out.println("textcase pass");
	        }
	        else
	        {
	        	System.out.println("textcase pass");
	        }*/
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, Expected);
	}
	public void selectPowerBank() {
		String actualpower = selectedinCartPowerBank.getText();
		String Expectedpower="ubon pb x90";
		/* if(actualpower.equals(Expectedpower))
	        {
	        	System.out.println("textcase pass");
	        }
	        else
	        {
	        	System.out.println("textcase pass");
	        }*/
		SoftAssert s1=new SoftAssert();
		s1.assertEquals(actualpower, Expectedpower);
		
	}
	
}
