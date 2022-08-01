package com.Database.PracticeTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel
{
public static void main(String[] args) throws IOException 
{
	FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	
	
	Sheet sheet = wb.getSheet("Projects");
   


	for(int i=0;i<=sheet.getLastRowNum()-1;i++)
		{
		Row row = sheet.getRow(i);
		
		for(int j=0;j<=row.getLastCellNum()-1;j++)
		{
			Cell cell = row.getCell(j);
			String v = cell.getStringCellValue();
            System.out.println(v);
		}
	}
}}

