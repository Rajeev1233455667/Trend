package com.trend.genericUtility;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.trend.objectRepository.CommonPage;
import com.trend.objectRepository.HomePage;
import com.trend.objectRepository.LoginPage;

public class BaseClass {
protected  ExcelUtility excelUtility;
protected  FileUtility fileUtility;
protected  JavaUtility javaUtility;
protected  WebDriverUtility webDriverUtility;
protected  WebDriver driver;
protected  LoginPage login;
protected  CommonPage commonpage;

/**
 * create object for generic utility
 * read data from property file
 * open excel file
 * lauch browser ,application and setup browser
 * create object for common Pom classes
 * @throws IO Exception
 * @throws EccryptedDocumentException
 */
@BeforeClass
public void  classSetup()
{
	//create object for generic utility
	excelUtility=new ExcelUtility();
	fileUtility=new FileUtility();
	javaUtility=new JavaUtility();
	webDriverUtility=new WebDriverUtility();
	//read data from property file
	  String browser = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.BROWSER.convertToString());
	  String url = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.URL.convertToString());
	 // String mail = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.MAIL.convertToString());
	 // String password = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.PASSWORD.convertToString());
	    Long timeout=(Long)javaUtility.stringToAnyDataType(fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH ,PropertyFileKeys.TIMEOUT.convertToString()),"long");
	//lauch browser,application and setup browser
	    driver = webDriverUtility.LaunchApplication(browser,timeout,url);
	    //create object for common Pom classes
	    HomePage homepage=new HomePage(driver);
	    homepage.clickOnHomePage();
	    login=new LoginPage(driver);
	    
	    commonpage=new CommonPage(driver);
	    
	    
	       
}
@BeforeMethod

	public void methodSetup() {
	HomePage homepage=new HomePage(driver);
	homepage.clickOnHomePage();
	  String mail = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.MAIL.convertToString());
	  String password = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.PASSWORD.convertToString());
	  login.enterUserName(mail);
	  login.enterPassword(password);
		login.clickLogin();
		/**
		 * used to signout from application
		 */
}
		@AfterMethod
		public void methodTearDown() {
			
			
		}
		@AfterClass
		public void classTearDown()
		{
	
		}
		
}

