package com.labs.pageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labs.Utilities.Util;
import com.labs.base.BaseLabsClass;

public class HomePage extends Util{
	@FindBy(xpath = "(//a[text()='Laptops & Notebooks'])[1]")
	private WebElement laptopNotes;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptops;
	
	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortByDropdown;
	
	@FindBy(xpath="//select[@id='input-limit']")
	public WebElement showDropDown;

	@FindBy(xpath="//a[contains(text(),'MacBook Pro')]")
	public WebElement macBookPro;
	
	@FindBy(id="button-cart")
	public WebElement addToCart;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void selectLaptop() throws InterruptedException
	{
		Util.mouseHover(laptopNotes);
		Util.hardWait(3);
		Util.clickOnElement(showAllLaptops, 2);
		Util.hardWait(3);
		Util.waitTovisibility(sortByDropdown, 5);	
	}
	
	public void selectSort() throws InterruptedException
	{
		Util.clickOnElement(sortByDropdown, 2);
		Util.selectByValue(sortByDropdown, "Model (Z - A)");
		Util.selectByIndex(showDropDown, 4);
		Util.hardWait(5);
	}
	
	public void scrollDown() throws InterruptedException
	{
	Util.waitTovisibility(macBookPro, 3);	
	Util.scrollToElement(macBookPro);
	Util.hardWait(5);
	Util.JSExecuteClick(macBookPro);
	Util.waitTovisibility(addToCart, 2);
	
	}
}
