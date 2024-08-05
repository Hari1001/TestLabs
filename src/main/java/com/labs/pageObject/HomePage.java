package com.labs.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labs.Utilities.Util;

public class HomePage extends Util {
	@FindBy(xpath = "(//a[text()='Laptops & Notebooks'])[1]")
	private WebElement laptopNotes;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptops;

	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement sortByDropdown;

	@FindBy(xpath = "//select[@id='input-limit']")
	public WebElement showDropDown;

	@FindBy(xpath = "//a[contains(text(),'MacBook Pro')]")
	public WebElement macBookPro;

	@FindBy(xpath = "(//a[text()='HP LP3065'])[2]")
	public WebElement hpLaptop;

	@FindBy(id = "button-cart")
	public WebElement addToCart;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void selectLaptop() throws InterruptedException {
		Util.mouseHover(laptopNotes);
		Util.hardWait(2);
		Util.clickOnElement(showAllLaptops, 2);
		Util.hardWait(2);
		Util.waitTovisibility(sortByDropdown, 5);
	}

	public void selectSort() throws InterruptedException {
		Util.clickOnElement(sortByDropdown, 2);
		Util.selectByValue(sortByDropdown, "Model (Z - A)");
		Util.selectByIndex(showDropDown, 4);
		Util.hardWait(2);
	}

	public void scrollDown() throws InterruptedException {
		Util.waitTovisibility(macBookPro, 3);
		Util.scrollToElement(macBookPro);
		Util.hardWait(2);
		Util.JSExecuteClick(macBookPro);
		Util.waitTovisibility(addToCart, 2);
	}

	public void SelectHPLaptop() throws InterruptedException {
		selectLaptop();
		Util.clickOnElement(hpLaptop, 2);

	}

}
