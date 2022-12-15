package com.trend.men;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.trend.genericUtility.BaseClass;
import com.trend.genericUtility.FileUtility;
import com.trend.genericUtility.IConstantPath;
import com.trend.genericUtility.JavaUtility;
import com.trend.genericUtility.PropertyFileKeys;
import com.trend.genericUtility.WebDriverUtility;
import com.trend.objectRepository.CartPage;
import com.trend.objectRepository.CommonPage;
import com.trend.objectRepository.HomePage;
import com.trend.objectRepository.LoginPage;
import com.trend.objectRepository.MenTshirt;

public class CreateMenTest1 extends BaseClass {
	
@Test
	public  void createMenTest1() throws IOException {
		//create the object of Fileutility
		FileUtility fileUtility=new FileUtility();
		//create rhe object of webdriverUtility
		WebDriverUtility webDriverUtility=new WebDriverUtility(); 
		//create the object of javaUtility
		JavaUtility javaUtility=new JavaUtility();
		//read the data from propertyfile
		//  String browser = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.BROWSER.convertToString());
		//  String url = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.URL.convertToString());
		//  String mail = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.MAIL.convertToString());
		//  String password = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.PASSWORD.convertToString());
		 //   Long timeout=(Long)javaUtility.stringToAnyDataType(fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH ,PropertyFileKeys.TIMEOUT.convertToString()),"long");
	//launch the application 
		//  WebDriver driver = webdriverUtility.LaunchApplication(browser,timeout,url);
		  //create the object of home page
			HomePage homepage=new HomePage(driver);
			//call theclickonHomePage method
		
			
			//homepage.clickOnHomePage();
			//create the login page
			//LoginPage login=new LoginPage(driver); 
			//create the object of menTshirt
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("div[text()='successfully logged in']")));
			 MenTshirt  menTshirt=new  MenTshirt(driver);
			 //create the object of commompage
			 CommonPage commonpage=new CommonPage(driver);
			 //create the object of cartpge
			 CartPage cartpage=new CartPage(driver);
			 //call the enterUsername method
		//	login.enterUserName(mail);
			//call the enterpassword meyhod
		//	login.enterPassword(password);
			//login.clickLogin();
			//call menAction method by passing webdriverUtility 
			
		homepage.menAction(webDriverUtility);
		homepage.clickOnTshirt();
		//call menAction method by passing webdriverUtility 
		homepage.mentshirtAction(webDriverUtility);
		menTshirt.clickOnMenTshirt();
		commonpage.clickOnCart();
		cartpage.selectCart();
		//	webdriverUtility.mouse_hover_onelement(driver,"Men");
			
		
	}

}