package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		String fileName="./src/test/resources/TestData.xlsx";
		FileInputStream fileInput=new FileInputStream(new File(fileName));
		Workbook workbook=null;
		workbook=WorkbookFactory.create(fileInput);
		Sheet sheet=workbook.getSheet("Data");
		int totalRows=sheet.getLastRowNum();
		for(int i=1;i<=totalRows;i++)
		{
			sheet.getRow(i).createCell(2,CellType.STRING).setCellValue("Passed");
		}
		FileOutputStream fileOutput=new FileOutputStream(new File(fileName));
		workbook.write(fileOutput);
		workbook.close();

	}

}
