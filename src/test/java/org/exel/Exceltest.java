package org.exel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

public class Exceltest {

	public static void main(String[] args) throws IOException {
	File location=new File("C:\\Users\\asus\\eclipse-workspace\\Maven\\src\\test\\resources\\excel\\basic.xlsx");
	FileInputStream excel=new FileInputStream(location);
	Workbook wb=new XSSFWorkbook(excel);
	Sheet wksheet=wb.getSheet("sheet1");
    Row row=wksheet.getRow(1);
    System.out.println(row);
    Cell excell=row.getCell(2);
    System.out.println(excell);

   int rowcount =Sheet.getPhysicalNumberOfRows();
   
   
   for(int i=0;i < sheet.)
	
	}

}
