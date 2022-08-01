package com.crm.vtiger;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
public static void main(String[] args) throws Throwable, IOException {
	 FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Projects");
		for(int i=0;i<sh.getLastRowNum();i++)
		{
		Row R=sh.getRow(i);
		for(int j=1;j<R.getLastCellNum();j++)
		{
			Cell c=R.getCell(j);
			String value=c.getStringCellValue();
			System.out.print(value+" ");
	
}
}}}
