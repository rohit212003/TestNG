package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fileInput = new FileInputStream(new File("./src/test/resources/TestData.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fileInput);
		XSSFSheet sheet = workbook.getSheet("Data");
		System.out.println("Total Rows: "+sheet.getLastRowNum());
		System.out.println("Total col:"+sheet.getRow(1).getLastCellNum());
		int totalRows=sheet.getLastRowNum();
		for(int i=1;i<=totalRows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			int firstCellNum=row.getFirstCellNum();
			int lastCellNum=row.getLastCellNum();
			
			//int totalCols=row.getLastCellNum();
			for(int j=firstCellNum;j<lastCellNum;j++)
			{
				if(row.getCell(j).getCellType()==CellType.STRING)
					System.out.println(row.getCell(j).getStringCellValue());
				else if(row.getCell(j).getCellType()==CellType.NUMERIC)
					System.out.println(row.getCell(j).getNumericCellValue());
					
			}
//			for(int j=0;j<totalCols;j++)
//			{
//				
//					System.out.println(row.getCell(j).getStringCellValue());
//				
//					
//			}
			System.out.println("");
		}
		workbook.close();

	}

}
