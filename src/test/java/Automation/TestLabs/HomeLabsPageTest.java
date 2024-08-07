package Automation.TestLabs;

import org.testng.annotations.Test;

import com.labs.base.BaseLabsClass;
import com.labs.pageObject.DeliveryDetailsPage;
import com.labs.pageObject.HomePage;
import com.labs.pageObject.IndexPage;
import com.labs.pageObject.LoginPage;
import com.labs.pageObject.OpenCartPage;
import com.labs.pageObject.checkoutPage;


public class HomeLabsPageTest extends BaseLabsClass{
	IndexPage index;
	LoginPage login;
	HomePage home;
	OpenCartPage open;
<<<<<<< HEAD
	DeliveryDetailsPage delivery;
=======
	checkoutPage check;
>>>>>>> 8c185a0d10a55232ad158d019ba7b62cd36b1b69
	

	@Test//(dataProvider = "getExcelData")
	public void verfiyHomePage() throws InterruptedException
	{
		index= new IndexPage();
		login = new LoginPage();
		home = new HomePage();
		open = new OpenCartPage();
<<<<<<< HEAD
		delivery = new DeliveryDetailsPage();
=======
		check= new checkoutPage();
>>>>>>> 8c185a0d10a55232ad158d019ba7b62cd36b1b69
		index.verifyMyAccount();
		login.verfiyLogin();
		home.selectLaptop();
		home.selectSort();
		home.scrollDown();
<<<<<<< HEAD
		open.verifyaddToCart();
		delivery.verifyDeliveryDetails();
=======
		open.verifyCartTable();
		home.SelectHPLaptop();
		open.verifyCartTable();
		check.verifyTableData();
>>>>>>> 8c185a0d10a55232ad158d019ba7b62cd36b1b69
	}
}

