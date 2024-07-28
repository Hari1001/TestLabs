package Automation.TestLabs;

import java.io.IOException;

import org.testng.annotations.Test;

import com.labs.Utilities.ExcelLibrary;

public class ReadExcelData {
//	
	ExcelLibrary library= new ExcelLibrary();
//	
//	@Test
//	public void readExcelData() throws IOException
//	{
//		//ExcelLibrary library= new ExcelLibrary();
//	String data=library.readData("Automation", 1, 1);
//	System.out.println(data);
//	}
////	
//	@Test
//	public void writeExcelData() throws IOException
//	{
//		ExcelLibrary library= new ExcelLibrary();
//		library.writeExcel("Automation", "Status", 0, 2);
//		
//	}
//	@Test
//	public void getRowCount() {
//	int count=	library.getRowCount("Automation");
//	System.out.println("Rows Count : "+count);
//	}
//
	@Test
	public void addSheetinExcel() throws IOException {
		library.addSheet();
		library.removeSheet();
	
	}

//	@Test
//	public void getColcountinExcel() throws IOException {
//		int col=library.getColCount("Automation");
//		System.out.println("Columns count : "+col);
//	}
	
//	@Test
//	public void getCellData() throws IOException {
//		//library.addSheet();
//		Object col[][]=library.getTestData("Automation");
//	//	System.out.println(col);
//	
//	}
	
//	@Test
//	public void getData()
//	{
//		Object data[][]=library.getTestData("Automation");
//		//System.out.println(data);
//	}
}
