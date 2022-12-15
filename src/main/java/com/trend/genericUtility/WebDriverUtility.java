package com.trend.genericUtility;

import java.io.File;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	private WebDriver driver;
	private WebDriverWait wait;

	public WebDriver LaunchApplication(String browser,long timeout,String url)
	{
		/**
		 * this is used launch the browser
		 * maximize the browser
		 * provide implicit wait
		 */
	
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("please enter valid browser name");
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		driver.get(url);
		return driver;
		
	}
	/**
	    * to select the values according to visible text
	     * @author rajeev
	     */
	 public void select_byvisibletext(WebElement element, String vtext) {
		 Select s=new Select(element);
		 s.selectByVisibleText(vtext);
	 }
	 /**
	  * 
	  * @param driver
	  * this is used for mouse action
	  * @param Element
	  */
	 
	 public void mouse_hover_onelement(WebElement Element) {
		  Actions a=new Actions(driver);
		 a.moveToElement(Element).perform();
	 }
	 /**
	  * used to wait until the page loads completely
	  * @param driver
	  * 
	  * @author rajeev
	 */
	    public void page_loadtime(WebDriver driver) {
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}
	    /**
	     * to dismiss the alert we use dismiss
	     * @param driver
	     */
	     public void switch_to_alert_dismiss(WebDriver driver) {
	     driver.switchTo().alert().dismiss();
	     }
	     public void intializeExplicitWait( long timeout,By element)
	     {
	    	 
			wait=new WebDriverWait(driver, timeout);
	    	 wait.until(ExpectedConditions.invisibilityOfElementLocated(element));
	    	 
	     }
	     /**
	     * to accept the alert we use accept
	     * @param driver
	     */
	     public void switch_to_alert_accept(WebDriver driver) {
	     driver.switchTo().alert().accept();
	     }
	     /**
	     * to switch the window based on title
	     * @param driver
	     * @param title
	     */
	     public void Switch_to_window(WebDriver driver,String title) {
	     Set<String> allid = driver.getWindowHandles();
	     java.util.Iterator<String> it = allid.iterator();
	     while(it.hasNext()) {
	     String wid=it.next();
	     driver.switchTo().window(wid);
	     if(driver.getTitle().contains(title)) {
	     break;
	     }
	     }}
	     /**
	      * this is used for mouse action
	      * @param driver
	      * @param element
	      */
	     public void mouseHoverToElement(WebDriver driver,WebElement element) {
	    	 Actions a=new Actions(driver);	
	    	 a.moveToElement(element).perform();
	     }
	     /**
	     * used to Switch to Alert Window & click on OK button
	     * @param driver
	     */
	     public void swithToAlertWindowAndAccpect(WebDriver driver) {
	     driver.switchTo().alert().accept();
	     }
	     /**
	     * used to Switch to Alert Window & click on Cancel butt
	     * @param driver
*/
public void swithToAlertWindowAndCancel(WebDriver driver) {
driver.switchTo().alert().dismiss();
}
/**
* used to Switch to Frame Window based on index
* @param driver
* @param index
*/
public void swithToFrame(WebDriver driver , int index) {
driver.switchTo().frame(index);
}
/**
* used to Switch to Frame Window based on id or name attribute
* @param driver
* @param id_name_attribute
*/
public void swithToFrame(WebDriver driver , String id_name_attribute) {
driver.switchTo().frame(id_name_attribute);
}
/**
* used to select the value from the dropDwon based on index
* @param driver
* @param index
*/
public void select(WebElement element , int index) {
Select sel = new Select(element);
sel.selectByIndex(index);
		
		
}
/**
* used to right click on specified element
* @param driver
* @param elemnet
*/
public void rightClickOnElement(WebDriver driver , WebElement elemnet)
{
Actions act = new Actions(driver);
act.contextClick(elemnet).perform();
}
/**
*
* @param driver
* @param javaScript
*/
public void executeJavaScript(WebDriver driver , String javaScript) {
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeAsyncScript(javaScript, null);
}
public void waitAndClick(WebElement element) throws InterruptedException
{
int count = 0;
while(count<20) {
try {
element.click();
break;
}catch(Throwable e){
Thread.sleep(1000);
count++;
}
}
}
public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File src=ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File("./screenshot/"+screenshotName+".PNG");
	 Files.copy(src, dest);

}
/**
* pass enter Key appertain in to Browser
* @param driver
*/
public void passEnterKey(WebDriver driver) {
Actions act = new Actions(driver);
act.sendKeys(Keys.ENTER).perform();
}
}






