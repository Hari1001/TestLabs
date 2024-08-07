package com.labs.Utilities;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.labs.base.BaseLabsClass;

public class Util extends BaseLabsClass { // Single Level inheritance
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public static void clickOnElement(WebElement ele, int timeout) {
		try {
			ele.click();
			waitForElement(timeout);
		} catch (Exception e) {
			System.out.println("Error occured while clicking element" + e.getMessage() + "    " + ele);
		}
	}

	public static void hardWait(int timeout) {
		try {

			timeout = timeout * 1000;
			Thread.sleep(timeout);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void selectByIndex(WebElement element, int index) {

		try {
			Select s = new Select(element);
			s.selectByIndex(index);
		} catch (Exception e) {
			Assert.assertTrue(false, "Couldnt able to select the index : " + element);
		}
	}

	public static void selectByValue(WebElement element, String value) {

		try {
			Select s = new Select(element);
			s.selectByVisibleText(value);
		} catch (Exception e) {
			Assert.assertTrue(false, "Couldnt able to select the index : " + element);
		}
	}

	public static void scrollToElement(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		} catch (Exception e) {
			Assert.fail("Couldn't able to click through JSExecutor : " + e.getMessage() + " : " + element);

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

	public static void waitForElement(int timeout) { // Polymorphism == Method overloading == compile time polymorpshim
														// Static polymorphism
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

	public static void JSExecuteClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void scrollDown(int pixel) {
		js.executeScript("window.scrollTo(" + pixel + ", document.body.scrollHeight);");
	}

	public static void KeySEnter(WebElement element) {

		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		element.sendKeys(selectLinkOpeninNewTab);// act.keyDown(Keys.CONTROL).sendKeys("T").keyUp(Keys.CONTROL).build().perform();

	}

	public static void switchWindow() {
//		String parentWindow=driver.getWindowHandle();
//		System.out.println(parentWindow);
//		Set<String> set = driver.getWindowHandles();
//		List<String> list= new ArrayList<String>(set);
//		for(String s:list)
//		{
//			String window=driver.switchTo().window(s).getWindowHandle();
//			System.out.println(window);
//			if(!window.equalsIgnoreCase(parentWindow))
//			{
//				driver.switchTo().window(parentWindow);
//			}
//		}
<<<<<<< HEAD
		
		String parent= driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		//List<String> li= new ArrayList<String>(set);
		Iterator<String> it= set.iterator();
		
	//	Set<Integer> s= new HashSet<Integer>()
		while(it.hasNext())
		{String childWindow=it.next();
			
		//String title= driver.switchTo().window(childWindow).getTitle();
		
			if(!parent.equalsIgnoreCase(childWindow))
			{
=======

		String parent = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(set);
		Iterator<String> it = set.iterator();

		// Set<Integer> s= new HashSet<Integer>()
		while (it.hasNext()) {
			String childWindow = it.next();

			String title = driver.switchTo().window(childWindow).getTitle();

			if (!parent.equalsIgnoreCase(childWindow)) {
>>>>>>> 8c185a0d10a55232ad158d019ba7b62cd36b1b69
				driver.switchTo().window(childWindow);
				//driver.close();
			}

		}
<<<<<<< HEAD
		//driver.switchTo().window(parent);
		
	
=======
		driver.switchTo().window(parent);

>>>>>>> 8c185a0d10a55232ad158d019ba7b62cd36b1b69
//		String parent = driver.getWindowHandle();
//		Set<String> s = driver.getWindowHandles();
//
//		
//		Iterator<String> I1 = s.iterator();
//
//		while (I1.hasNext()) {
//
//			String child_window = I1.next();
//			if (!parent.equals(child_window)) {
//				driver.switchTo().window(child_window);
//			//	System.out.println(driver.switchTo().window(child_window).getTitle());
//		//		driver.close();
//			}
//		}
//		// switch to the parent window
//		driver.switchTo().window(parent);
	}

	public static void screenshot(String fileName) {
		try {
			File copyfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(copyfile, new File("D://Testing//TestLabs/Screenshots" + fileName + ".jpg"));

		} catch (Exception e) {
			Assert.fail("Failing while taking screenshot" + e.getMessage());
		}
	}
}
