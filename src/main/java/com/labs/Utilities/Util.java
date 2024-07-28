package com.labs.Utilities;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.labs.base.BaseLabsClass;

public class Util extends BaseLabsClass {   // Single Level inheritance
	JavascriptExecutor js = (JavascriptExecutor)driver;
	public static void clickOnElement(WebElement ele, int timeout) {
		try {
			ele.click();
			waitForElement(timeout);
		} catch (Exception e) {
			System.out.println("Error occured while clicking element" + e.getMessage() + "    " + ele);
		}
	}
	
	public static void hardWait(int timeout) throws InterruptedException {
		timeout = timeout * 1000;
		Thread.sleep(timeout);
	}

	
	
	public static void selectByIndex(WebElement element, int index) {

		try {
			Select s = new Select(element);
			s.selectByIndex(index);
		} catch (Exception e) {
			Assert.assertTrue(false,"Couldnt able to select the index : "+element);
		}
	}

	public static void selectByValue(WebElement element, String value) {

		try {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		} catch (Exception e) {
			Assert.assertTrue(false,"Couldnt able to select the index : "+element);
		}
	}
	public static void scrollToElement(WebElement element)
	{
		try {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		catch(Exception e)
		{
			Assert.fail("Couldn't able to click through JSExecutor : "+e.getMessage()+" : "+element);
		
		}
	}

	// Explicit wait
	public static void waitTovisibility(WebElement element, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println("Waiting for visibility of element failed " + e.getMessage());
		}
	}

	// Validting the functionality of sendkeys
	
	public static void sendKeysToElement(WebElement ele, String value, int timeout) {
		try {
			waitForElement(timeout);
			ele.clear();
			ele.sendKeys(value);
		} catch (Exception e) {
			System.out.println("Getting error while sending value" + e.getMessage());
		}
	}



	public static void waitForElement(int timeout) {  // Polymorphism == Method overloading == compile time polymorpshim Static polymorphism
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
		// Thread.sleep(timeout);
	}

	public void fluentwait(int timeout, int pollOut) {
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5))
				.ignoring(Exception.class);
	}

	public static void mouseHover(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}
		
	public static void JSExecuteClick(WebElement element)
	{	
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("arguments[0].click();", element);
	}
	
	
	
	public void scrollDown(int pixel)
	{
		js.executeScript("window.scrollTo("+pixel+", document.body.scrollHeight);");
	}

}
