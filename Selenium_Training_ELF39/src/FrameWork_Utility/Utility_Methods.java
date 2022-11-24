package FrameWork_Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Utility_Methods extends Base_Test {
	
	//utility method for excel
	@Test
	public  static Object[][] getTestData(String sheetname) throws IOException {
		
		//File path
		String filepath="./Test_Data/DWS_TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		//Create object for Excel file
		Workbook book=new XSSFWorkbook(fis);
		
		//Access the sheet
		Sheet sheet=book.getSheet(sheetname);
		
		//Access the row and cell
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[row_count-1][col_count];
		
		//Print all the rows and columns
		for(int row=1;row<=row_count-1;row++) {
			for(int col=0;col<=col_count-1;col++) {
				
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
			}
		}
		book.close();
		return data;
	}
	
	
	//utility method for sendkeys
	public static void Enter_value_in_editfield(WebElement element,String value) {
		element.sendKeys(value);
	}
	//utility method for click
	public static void Click_element(WebElement element) {
		element.click();
	}
	
	public static Select SelectUtility12(WebElement element) {
		
		Select s=new Select(element);
		return  s;
		
	}
	public static Actions ActionsUtility(WebElement element) {
		Actions a=new Actions (driver);
		return a;
	}
	public static void selectByIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public static void selectByValue(WebElement ele,String value) {
		Select se=new Select(ele);
		se.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement ele,String text) {
		Select s= new Select(ele);
		s.selectByVisibleText(text);
	}
	public static String Test_Configuration() throws IOException {
		String filepath="./Test_Configuration/TestConfiguration.properties";
		FileInputStream fis=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("URL");
		return url;
		
	}

}
