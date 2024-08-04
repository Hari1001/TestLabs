package Automation.TestLabs;

import java.io.IOException;

import org.testng.annotations.Test;

import com.labs.base.BaseLabsClass;
import com.labs.pageObject.BillingDetails;
import com.labs.pageObject.Checkout;
import com.labs.pageObject.HomePage;
import com.labs.pageObject.IndexPage;
import com.labs.pageObject.LoginPage;
import com.labs.pageObject.OpenCartPage;


public class HomeLabsPageTest extends BaseLabsClass{
	IndexPage index;
	LoginPage login;
	HomePage home;
	OpenCartPage open;
	Checkout check;
	BillingDetails bill;
	

	@Test//(dataProvider = "getExcelData")
	public void verfiyHomePage() throws InterruptedException, IOException
	{
		index= new IndexPage();
		login = new LoginPage();
		home = new HomePage();
		open = new OpenCartPage();
		check = new Checkout();
		bill = new BillingDetails();
		index.verifyMyAccount();
		login.verfiyLogin();
		home.selectLaptop();
		home.selectSort();
		home.scrollDown();
		open.verifyaddToCart();
		check.Items();
		bill.Billing();
		
	}
}
