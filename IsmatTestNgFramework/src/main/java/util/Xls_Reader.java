package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls_Reader {
	public String path; // is to declare the excel path
	public FileInputStream fis=null; //read a file
	
	private XSSFWorkbook workbook = null; //connects with the excel
	private XSSFSheet sheet = null; //connects with the excel sheet
	private XSSFRow row = null; //connects with the row
	private XSSFCell cell = null; //connects with the cell (column)
	
	public Xls_Reader(String path) {
		this.path = path;
		try {
			fis = new FileInputStream(path); //FileInputStream reads the file from the given file
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			workbook = new XSSFWorkbook(fis); // connects with the excel
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet = workbook.getSheetAt(0); //connects with the sheet
		
		try {
			fis.close(); // close the book
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getCellData(String sheetName, String colName, int rowNum) {
		try {
			//for sheet 
			//identify the sheet and get sheet info using getSheetIndex
			int index = workbook.getSheetIndex(sheetName);
			int col_Num = 0;
			sheet = workbook.getSheetAt(index);
			
			//for row 
			//using for loop to get all the info from the row
			// and converting the column name to number
			row = sheet.getRow(0);
			for(int i=0; i<row.getLastCellNum(); i++) {
				if(row.getCell(i).getStringCellValue().trim().equals(colName.trim())) {
					col_Num = i;
				}
			}
			
			//for column
			row = sheet.getRow(rowNum-1);
			cell = row.getCell(col_Num);
			return cell.getStringCellValue();
		}
		catch(Exception e) {
			e.printStackTrace();
			return rowNum + colName;
		}
	}

}
