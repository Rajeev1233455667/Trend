package com.address.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.trend.genericUtility.BaseClass;
import com.trend.genericUtility.ExcelUtility;
import com.trend.genericUtility.FileUtility;
import com.trend.genericUtility.IConstantPath;
import com.trend.genericUtility.JavaUtility;
import com.trend.genericUtility.PropertyFileKeys;
import com.trend.genericUtility.SheetName;
import com.trend.genericUtility.WebDriverUtility;
import com.trend.objectRepository.AddAddressPage;
import com.trend.objectRepository.AddAddresssPage;
import com.trend.objectRepository.CommonPage;
import com.trend.objectRepository.HomePage;
import com.trend.objectRepository.LoginPage;
import com.trend.objectRepository.ProfilePage;



public class AddAddressTestCase2 extends BaseClass {
@Test
	public static void main(String[] args) {
		//create object for generic utility
		WebDriverUtility webdriverUtility=new WebDriverUtility();
//create the object of excelUtility
        ExcelUtility excelUtility=new ExcelUtility();
        //create the object of filleUtility
		FileUtility fileUtility=new FileUtility();
		//create the object of javaUtility
				JavaUtility javaUtility=new JavaUtility();
				//read the data from propertyfile
		//  String browser = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.BROWSER.convertToString());
		//  String url = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.URL.convertToString());
		 // String mail = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.MAIL.convertToString());
		 // String password = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,PropertyFileKeys.PASSWORD.convertToString());
	    // Long timeout=(Long)javaUtility.stringToAnyDataType(fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH ,PropertyFileKeys.TIMEOUT.convertToString()),"long");
		  //read from excel file
		 // System.out.println(mail);
		   String name = excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, SheetName.ADDRESS.ConvertToString(),2,1);
		   String house = excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, SheetName.ADDRESS.ConvertToString(),2,2);
		   String street = excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, SheetName.ADDRESS.ConvertToString(),2,3);
		  String landmark = excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, SheetName.ADDRESS.ConvertToString(),2,4);
		      String pincode = excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, SheetName.ADDRESS.ConvertToString(),2,5);
		    String phonenumber= excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, SheetName.ADDRESS.ConvertToString(),2,6);
		  /**
		   * launch the browser
		   */
		 //  WebDriver driver = webdriverUtility.LaunchApplication(browser,timeout,url);
		    
		    /**
			   * object of pom class
			   */
		    
		    
	//	HomePage homepage=new HomePage(driver);
	//	homepage.clickOnHomePage();
	//	LoginPage login=new LoginPage(driver); 
		//login.loginAction(mail,password);
		//login.enterUserName(mail);
		//login.enterPassword(password);
		//login.clickLogin();
	//	CommonPage commonpage=new CommonPage(driver);
	//	commonpage.clickSetting();
	//	commonpage.clickOnProfile();
	//	ProfilePage profilepage=new ProfilePage(driver);
	//	profilepage.clickOnMyAdress();
	//	AddAddressPage addaddresspage=new AddAddressPage(driver);
	//	addaddresspage.clickOnMyAdress();
	//	AddAddresssPage addaddressspage=new AddAddresssPage(driver);
	//	addaddressspage.addAddresssHome();
	//	  addaddressspage.addAddresssName(name);
		//  addaddressspage.addAddresssHouse(house);
		//  addaddressspage.addAddresssStreet(street);
		//  addaddressspage.addAddresssLand(landmark);
		//  addaddressspage.countryList(webdriverUtility);
		//  WebElement element = addaddressspage.countryList();
		//  webdriverUtility.select_byvisibletext(element, "Country");
		  
		
		
		

		

		


		

	}

	

}
