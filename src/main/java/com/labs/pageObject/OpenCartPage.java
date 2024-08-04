package com.labs.pageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labs.Utilities.Util;

public class OpenCartPage extends Util { // Multi level Inheritance

	@FindBy(id = "button-cart")
	public WebElement addToCart;

	@FindBy(xpath = "//input[@id='input-quantity']")
	public WebElement inputQuantity;

	@FindBy(linkText = "shopping cart")
	public WebElement shoppingCart;

	@FindBy(xpath = "//a[text()='Checkout']")
	public WebElement checkout;

	
	//driver.findElement(By.xpath("//strong[normalize-space()='Checkout']").click();
	
	public OpenCartPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyaddToCart() {
		Util.sendKeysToElement(inputQuantity, "2", 2);
		Util.clickOnElement(addToCart, 2);
		Util.waitTovisibility(shoppingCart, 2);
		Util.KeySEnter(shoppingCart);
		Util.switchWindow();
//		Util.scrollToElement(checkout);
//		Util.waitTovisibility(checkout, 2);
//		Util.sendKeysToElement(checkout,Keys.chord(Keys.CONTROL,"T"), 0);
//		Util.KeySEnter(checkout);
		Util.hardWait(5);
		Util.clickOnElement(checkout, 2);
		
	}

}
