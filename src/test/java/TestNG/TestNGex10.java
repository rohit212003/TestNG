package TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGex10 {
	
	  
	  @DataProvider(name="RetrieveData")
		public Object[][] retrieve() throws IOException {
			FileInputStream fileInput = new FileInputStream(new File("./src/test/resources/Book1.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
			XSSFSheet sheet = workbook.getSheet("Data");
			int rows = sheet.getLastRowNum();
			int columns = sheet.getRow(0).getLastCellNum();
			Object obj [][] = new Object[rows ][columns];
			for(int i=1;i<=rows;i++) {
				XSSFRow row = sheet.getRow(i);
				int totalcols = row.getLastCellNum();
				for(int j=0;j<totalcols;j++) {
					obj[i-1][j]= row.getCell(j).getStringCellValue();
				}
			}
			workbook.close();
			return obj;
		}
		@Test(dataProvider="RetrieveData")
		public void login(String userName, String password) {
			System.out.println("UserName: "+userName+ " Password: " + password);
		}
	


}
