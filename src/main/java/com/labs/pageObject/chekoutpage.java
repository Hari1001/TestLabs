package com.labs.pageObject;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labs.Utilities.Util;

public class chekoutpage extends Util {

	@FindBy(xpath = "//span[normalize-space()='Shopping Cart']")
	public WebElement shopingcart;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]")
	public WebElement subtotal;

	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]")
	public WebElement total;

	@FindBy(xpath = "//a[@class='btn btn-primary']")
	public WebElement Checkout;



	public chekoutpage() {
		PageFactory.initElements(driver, this);
	}

	public void chekout()
	{
		{

			Util.clickOnElement(shopingcart, 3);

			String subTotalElemen = subtotal.getText();
			System.out.println("Sub-Total: " + subTotalElemen);
			String TotalElemen = total.getText();
			System.out.println("Total: " + TotalElemen);


			// assertEquals(subTotalElemen,"TotalElemen");
			if(TotalElemen.equals(subTotalElemen) ) 

			{
				System.out.println("Total and Sub_total amounts are same "+ TotalElemen);
				Util.clickOnElement(Checkout, 3);
			}
			else {
				System.out.println("Total and Sub_total amounts are notsame");
			}
			System.out.println(subTotalElemen);

		}
	}
}


