package com.labs.pageObject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.labs.Utilities.Util;


public class BillingDetails extends Util {

	@FindBy(xpath ="//input[@id='input-payment-firstname']")
	public WebElement FirstName;
	
	@FindBy(xpath ="//input[@id='input-payment-lastname']")
	public WebElement LastName;
	
//	public void IndexPage() {
//		PageFactory.initElements(driver, this);
//	}
//	
	@FindBy(xpath ="//input[@id='input-payment-company']")
	public WebElement company;
	
	@FindBy(xpath ="//input[@id='input-payment-address-1']")
	public WebElement address_1;
	
	@FindBy(xpath ="//input[@id='input-payment-city']")
	public WebElement city;
	
	@FindBy(xpath ="//input[@id='input-payment-postcode']")
	public WebElement postcode;
	
	@FindBy(xpath ="//select[@id='input-payment-country']")
	public WebElement country_id;
	
	@FindBy(xpath ="//option[@value='99']")
	public WebElement country;
	
	@FindBy(xpath ="//select[@id='input-payment-zone']")
	public WebElement zone_id;
	
	@FindBy(xpath ="//option[contains(text(),'AndhraPradesh')]")
	public WebElement RegionState;

	@FindBy(xpath ="//input[@id='button-payment-address']")
	public WebElement nextpage;
	
	
	public void Billing() throws InterruptedException, IOException
	{

		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
		 pro = new Properties();
		pro.load(fi);
		PageFactory.initElements(driver, this);
		Util.sendKeysToElement(FirstName, pro.getProperty("firstname"), 3);
		Util.sendKeysToElement(LastName, pro.getProperty("lastname"), 3);
		Util.sendKeysToElement(company, pro.getProperty("company"), 3);
		Util.sendKeysToElement(address_1, pro.getProperty("address_1"), 3);
		Util.sendKeysToElement(city, pro.getProperty("city"), 3);
		Util.sendKeysToElement(postcode, pro.getProperty("postcode"), 3);
		Util.clickOnElement(country_id, 3);
		Util.sendKeysToElement(country_id, pro.getProperty("country_id"), 3);
		
		
		Select countrydropdown=new Select(country_id);
		List <WebElement>countrydropdownoptions=countrydropdown.getOptions();
		for(WebElement option:countrydropdownoptions)
		{
			System.out.println(option.getText());
		}
		countrydropdown.selectByVisibleText("India");
		
			
		Util.clickOnElement(zone_id, 2);
		Util.sendKeysToElement(zone_id, pro.getProperty("zone_id"), 2); 
		Util.clickOnElement(RegionState, 2);
		Util.sendKeysToElement(RegionState, pro.getProperty("RegionState"), 2); 
		
		Select RegionStatedropdown=new Select(zone_id);
		List <WebElement>RegionStatedropdownoptions=RegionStatedropdown.getOptions();
		for(WebElement option:RegionStatedropdownoptions)
		{
			System.out.println(option.getText());
		}
		RegionStatedropdown.selectByVisibleText("Andhra Pradesh");
		
		Util.clickOnElement(nextpage, 2);
		
//		
		//Util.hardWait(5);
	//	Assert.ass
	}
}
