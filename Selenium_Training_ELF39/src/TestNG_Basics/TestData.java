package TestNG_Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestData {
	
	@DataProvider(name = "TestData")
	public Object[][] testdata(){
		Object[][] data=new Object[4][2];
		data[0][0]="Chaithu";
		data[0][1]="Anu";
		data[1][0]="tara";
		data[1][1]="Sukanya";
		data[2][0]="Nethra";
		data[2][1]="umesh";
		data[3][0]="Sonu";
		data[3][1]="c";
		return data;
	}
	@Test (dataProvider="TestData")
	public void testdatademo(String firstname,String Lastname)
	{
		System.out.println(firstname);
		System.out.println(Lastname);
	}
	
}
