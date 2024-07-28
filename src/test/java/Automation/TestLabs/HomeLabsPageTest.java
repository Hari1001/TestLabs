package Automation.TestLabs;

import org.testng.annotations.Test;

import com.labs.base.BaseLabsClass;
import com.labs.pageObject.HomePage;
import com.labs.pageObject.IndexPage;
import com.labs.pageObject.LoginPage;


public class HomeLabsPageTest extends BaseLabsClass{
	IndexPage index;
	LoginPage login;
	HomePage home;
	

	@Test//(dataProvider = "getExcelData")
	public void verfiyHomePage() throws InterruptedException
	{
		index= new IndexPage();
		login = new LoginPage();
		home = new HomePage();
		index.verifyMyAccount();
		login.verfiyLogin();
		home.selectLaptop();
		home.selectSort();
		home.scrollDown();
	}
}
