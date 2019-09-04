package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {

	public static Object[][] readExcelData(String excelfileName) throws IOException {
		XSSFWorkbook wbook = 
				new XSSFWorkbook("./data/"+excelfileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count is: "+rowCount);
		int colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Col Count is: "+colCount);
		Object[][] data = new Object[rowCount][colCount];
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell cell = row.getCell(j);
				String stringCellValue = cell.getStringCellValue();
				data[i-1][j] = stringCellValue;
				System.out.println(stringCellValue);
			} 
		}
		return data;
	}
	
	
	
	
	
public static String readdata(String excelfileName, int Sheetno, int rowno, int colno) throws IOException {
		
		System.out.println("ENTERED READ EXCEL");
		XSSFWorkbook wbook = 
				new XSSFWorkbook("./data/"+excelfileName+".xlsx");
				
		XSSFSheet sheet = wbook.getSheetAt(Sheetno);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count is: "+rowCount);
		int colCount = sheet.getRow(1).getLastCellNum();
		System.out.println("---------------------");
		System.out.println("Col Count is: "+colCount);
	
			XSSFRow row = sheet.getRow(rowno);
			XSSFCell cell = row.getCell(colno);
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
				return stringCellValue;
								
			
		
	}
}







