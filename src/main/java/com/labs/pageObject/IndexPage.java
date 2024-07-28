package com.labs.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.labs.Utilities.Util;

public class IndexPage extends Util { //  Multi level Inheritance   

	@FindBy(xpath = "//span[text()='My Account']")
	public WebElement myAccount;

	@FindBy(xpath = "//a[text()='Login']")
	public WebElement loginButton;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public void verifyMyAccount() throws InterruptedException {

		Util.clickOnElement(myAccount, 2);
		Util.hardWait(1);
		Util.clickOnElement(loginButton, 2);
		Util.hardWait(2);

	}
}
