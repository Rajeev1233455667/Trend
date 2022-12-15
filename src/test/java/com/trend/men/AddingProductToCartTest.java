package com.trend.men;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.trend.genericUtility.BaseClass;
import com.trend.genericUtility.ExcelUtility;
import com.trend.genericUtility.FileUtility;
import com.trend.genericUtility.IConstantPath;
import com.trend.genericUtility.JavaUtility;
import com.trend.genericUtility.PropertyFileKeys;
import com.trend.genericUtility.WebDriverUtility;
import com.trend.objectRepository.CartPage;
import com.trend.objectRepository.CommonPage;
import com.trend.objectRepository.HomePage;
import com.trend.objectRepository.LoginPage;
import com.trend.objectRepository.PowerBank;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddingProductToCartTest  {
	//static WebDriver driver=null;
@Test
	public  void AddingProductToCartTest() {
		//create the object of excelutility
		  ExcelUtility excelUtility=new ExcelUtility();
		  //create the object of fileUtility
		  FileUtility fileUtility=new FileUtility();
		  //create the object of webdriverUtility
		  WebDriverUtility webdriverUtility=new WebDriverUtility();
		  //create the object of javaUtility
		  JavaUtility javaUtility=new JavaUtility();
		  //read from property file
		  String browser = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.BROWSER.convertToString());
		  String url = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.URL.convertToString());
		  String mail = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.MAIL.convertToString());
		  String password = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.PASSWORD.convertToString());
		    Long timeout=(Long)javaUtility.stringToAnyDataType(fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH ,PropertyFileKeys.TIMEOUT.convertToString()),"long");
			  WebDriver driver = webdriverUtility.LaunchApplication(browser,timeout,url);
			  /**
			   * object of pom class
			   */
				HomePage homepage=new HomePage(driver);
			//	homepage.clickOnHomePage();
				//LoginPage login=new LoginPage(driver); 
				PowerBank powerbank=new PowerBank(driver);
				CommonPage commonpage=new CommonPage(driver);
				CartPage cartpage=new CartPage(driver);
				//login.enterUserName(mail);
			//	login.enterPassword(password);
			//	login.clickLogin();
				homepage.electronicAction(webdriverUtility);
				homepage.clickOnPowerBank();
				homepage.movetopowerBankAction(webdriverUtility);
				powerbank.clickPowerBank();
				commonpage.clickOnCart();
				cartpage.selectPowerBank();
					
		

	}
		
	}


