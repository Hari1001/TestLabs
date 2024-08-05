package com.labs.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.labs.Utilities.ExcelLibrary;
import com.labs.Utilities.Util;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLabsClass {

	public static WebDriver driver;  /// Interface  oops concept
	public static Properties pro ;  // access modifiers
	ExcelLibrary lib= new ExcelLibrary();
	

	@BeforeTest   // Before TestNG
	public void launchApp() throws IOException, InterruptedException {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();  // chromeDriver() ;;
		
		// Maximizing the browser
		driver.manage().window().maximize();
		loadConfig();
		Util.waitForElement(3);
		String url = pro.getProperty("url");
		//System.out.println("URL : " + url);
		driver.get(url);	// Abstract method 
	}

	
	public static void loadConfig() throws IOException  // static methods 
	{

		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "//config.properties");
		 pro = new Properties();
		pro.load(fi);
		
	}
	
	@DataProvider
	public Object[][] getExcelData()
	{
		Object data[][]=lib.getTestData("Automation");
		return data;
	}

	@AfterTest
	public void tearDown() {
		//driver.quit();	
	}
}
