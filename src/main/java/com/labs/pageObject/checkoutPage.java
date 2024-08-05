package com.labs.pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.labs.Utilities.Util;

public class checkoutPage extends Util{
	
	@FindBy(xpath="//div[@class='table-responsive']//table//tr")
	public List<WebElement> tableRows;
	
	@FindBy(xpath = "(//div[@class='table-responsive']//table//tr)[1]//td")
	public List<WebElement> tableCols;
	
	 public checkoutPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTableData() {
		int rowcount=  tableRows.size();
		System.out.println(rowcount);
		int colCount=tableCols.size();
		System.out.println(colCount);
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=1;j<colCount;j++)
				
			{	
			String text=driver.findElement(By.xpath("(//div[@class='table-responsive']//table//tr)["+i+"]//td["+j+"]")).getText();
			if(text.contains("MacBook"))
			{
			//	Assert.assertEquals(text,"MacBook" , "The string doesn't match : ");
				System.out.println(text);
				break;
			}
			
			
			}
		}
		Util.screenshot("Table");
	}
	 
	
}
//(//div[@class='table-responsive']//table//tr)[1]//td
//div[@class='table-responsive']//table//tr

//div[@class='table-responsive']//table//tr
//(//div[@class='table-responsive']//table//tr)[1]//td

