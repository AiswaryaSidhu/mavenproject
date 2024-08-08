package ExcelFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelFileReadingWriting {
	
	/* Excel file reading and writing
	 * add apache poi, apache poi ooxml, apache poi ooxml schema dependencies in the pom.xml take it from maven repository
	 * 1 package, 1 class 
	 */
	@Test
	public void excelFileWR() throws IOException {
		/* Take an excel file from file manager
		 * copy the path of the excel file
		 * close the excel file
		 */
		//to reach the file destination
		File f=new File("C:\\Users\\aiswarya.hngopal\\Desktop\\Hara - Daily Activity.xlsx");
		//To fetch the file
		FileInputStream fis=new FileInputStream(f);
		//To convert it to workbook
		XSSFWorkbook x=new XSSFWorkbook(fis);
		//To reach the sheet
		XSSFSheet sheet=x.getSheetAt(0);
		//count no of rows
		int row =sheet.getLastRowNum();
		System.out.println("Numbers of rows are "+row);
		//count no of columns
		int column=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns are "+column);
		//fetch particular data present in it
		XSSFCell data = sheet.getRow(5).getCell(0);
		System.out.println("The available data is "+data);
		//writing - first decide where you want to write which row, which column
		//(2,4)
		sheet.getRow(2).createCell(3).setCellValue("Please start the daily activity");
		FileOutputStream fos=new FileOutputStream(f);
		x.write(fos);
	}
}
