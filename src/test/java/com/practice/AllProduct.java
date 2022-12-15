package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllProduct {

	
		
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.name("q")).sendKeys("iphone"+Keys.ENTER);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			List<WebElement> alllinks = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone ')]"));
			List<WebElement> alllinks2 = driver.findElements(By.xpath("//div[contains(text(),'APPLE iPhone ')]/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
			
			for(int i=0;i<alllinks.size();i++)
			{
			    String productname = alllinks.get(i).getText();
				 String productprice = alllinks2.get(i).getText();
				 System.out.println(productname+"-->"+productname);
			}
			
	}

}
