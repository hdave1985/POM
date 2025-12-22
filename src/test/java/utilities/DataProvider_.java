package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProvider_ 
{

	@DataProvider(name = "newtestDDT")
	public String[][] performAddDDT() throws IOException
	{
		String path = ".\\testData\\Opencart_LoginData.xlsx";
		
		ExcelUtility xlutil = new ExcelUtility(path);
		
		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);
		
		String  logindata[][] = new String[totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				logindata[i][j] = xlutil.getCellData("Sheet1", i, j);
			}
		}
		
		return logindata;
	}
	
}
