package com.labs.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labs.Utilities.Util;



public class Checkout extends Util{
	@FindBy(xpath ="//span[normalize-space()='Checkout']")
	public WebElement Checkout;
	
	@FindBy(xpath ="//input[@value='new']")
	public WebElement button;
	

	//			public void IndexPage() {
	//				PageFactory.initElements(driver, this);
	//			}
	//			

	public void Items() throws InterruptedException
	{
		PageFactory.initElements(driver, this);
		Util.clickOnElement(Checkout, 3);
		Util.clickOnElement(button, 3);
		//			Util.waitTovisibility(account, 5);
		//Util.hardWait(5);
		//	Assert.ass
	}

}


