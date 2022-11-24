package TestNG_Basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Basics {
	@Test
	public void exceldemo() throws IOException {
		
		//File path
		String filepath="./Test_Data/TestData.xlsx";
		
		FileInputStream fis=new FileInputStream(filepath);
		
		//Create object for Excel file
		Workbook book=new XSSFWorkbook(fis);
		
		//Access the sheet
		Sheet sheet=book.getSheet("Sheet1");
		
		//Access the row and cell
		int row_count=sheet.getPhysicalNumberOfRows();
		int col_count=sheet.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] data=new Object[row_count-1][col_count];
		
		//Print all the rows and columns
		for(int row=1;row<=row_count-1;row++) {
			for(int col=0;col<=col_count-1;col++) {
				
				data[row-1][col]=sheet.getRow(row).getCell(col).getStringCellValue();
//			System.out.print(" "+data[row][col]);
				
			}
//			System.out.println( );
//		}
//		for(int i=0;i<=data.length-1;i++) {
//			for (int j=0;j<=data[i].length-1;j++) {
//				System.out.println(data[i][j]);
//			}
//		}
//		
//		
		
	
	}
	}
}
