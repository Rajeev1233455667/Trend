package com.trend.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//strong/../../descendant::div[2]/input[@id='fl_email']") private WebElement usernameTextField;
    @FindBy(xpath="//strong/../../descendant::div[4]/input[@id='fl_password']") private WebElement passwordTextField;
    @FindBy(xpath="//span[text()='Login']") private WebElement loginButton;
    
    public LoginPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);

    
}
    //business library
  //  public void loginAction(String mail,String password) {
    //	usernameTextField.sendKeys(mail);
    	//passwordTextField.sendKeys(password);
    /**
     * this method is used to send the mail
     * @param mail
     */
   public void enterUserName(String mail) {
    	usernameTextField.sendKeys(mail);
    }
   /**
    * this method is used to send the password
    * @param mail
    */
    public void enterPassword(String password) {
    	passwordTextField.sendKeys(password);
}
    /**
     * this method is used to click on login
     * @param mail
     */
    public void clickLogin() {
    	loginButton.click();
    
}
}
