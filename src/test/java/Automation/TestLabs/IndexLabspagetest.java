package Automation.TestLabs;

import org.testng.annotations.Test;

import com.labs.base.BaseLabsClass;
import com.labs.pageObject.BillingDetails;
import com.labs.pageObject.Checkout;
import com.labs.pageObject.IndexPage;
import com.labs.pageObject.LoginPage;


public class IndexLabspagetest extends BaseLabsClass{
	IndexPage index;
	LoginPage login;
	Checkout check;
	BillingDetails bill;

	@Test//(dataProvider = "getExcelData")
	public void verifyLogin() throws Throwable {
		index= new IndexPage();
		login = new LoginPage();
		check = new Checkout();
		bill=new BillingDetails();
		index.verifyMyAccount();
		login.verfiyLogin();
		check.Items();
		bill.Billing();
	}	
	
}
