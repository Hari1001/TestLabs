package com.labs.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labs.Utilities.Util;

public class LoginPage extends Util{  // inheritance
	
	
	@FindBy(id="input-email")
	public WebElement userName;

	@FindBy(id="input-password")
	public WebElement passWord;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement login;
	
	@FindBy(xpath = "//a[text()='Account']")
	public WebElement account;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	public void verfiyLogin(String userName, String password) throws InterruptedException
//	{
//		Util.sendKeysToElement(userName, pro.getProperty("username"), 3);
//		Util.sendKeysToElement(passWord, pro.getProperty("password"), 3);
//		Util.clickOnElement(login, 3);
//		Util.waitTovisibility(account, 5);
//		Util.hardWait(5);
//	//	Assert.ass
//	}

	public void verfiyLogin() throws InterruptedException
	{
		Util.sendKeysToElement(userName, pro.getProperty("username"), 3);
		Util.sendKeysToElement(passWord, pro.getProperty("password"), 3);
		Util.clickOnElement(login, 3);
		Util.waitTovisibility(account, 5);
		Util.hardWait(5);
	//	Assert.ass
	}
	
	
	// ScrollintoElemnt
	// multiple windows
	// Multiple tabs
	// Iframes
	// Table data 
	// Apache POI
	// Right click 
	// Javascript executor
	// Screenshot
	// Assertions
}
