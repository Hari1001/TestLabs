package com.labs.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labs.Utilities.Util;

public class DeliveryDetailsPage extends Util {
	
	@FindBy(id="button-payment-address")
		public WebElement PaymentButton;
	@FindBy(xpath= "(//input[@name='shipping_address'])[2]")
		public WebElement DeliveryAddress;
	@FindBy(id="button-shipping-address")
		public WebElement DeliveryButton;
	
	public DeliveryDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	public void verifyDeliveryDetails() {
		Util.clickOnElement(PaymentButton, 2);
		Util.clickOnElement(DeliveryAddress, 2);
		Util.waitTovisibility(DeliveryAddress, 2);
		//Util.hardWait(2);
		Util.clickOnElement(DeliveryButton, 2);
		Util.waitTovisibility(DeliveryButton, 2);
		Util.hardWait(5);
		
		
		

	
		
	}
}

