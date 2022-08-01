package com.crm.vtiger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyFile {
public static void main(String[] args) throws IOException   {
	//Fetching data from property file 
	FileInputStream fis=new FileInputStream("src\\test\\resources\\PropertyFile.properties");
	Properties p=new Properties();
	p.load(fis);
	//String URL=p.getProperty("url");
	//String USERNAME=p.getProperty("username");
	//String PASSWORD=p.getProperty("password");
	//String BROWSER=p.getProperty("browser");
	
	// to get rqandom number
	Random R =new Random();
	R.nextInt(100);
	
	//Fetching data from excel sheet
FileInputStream fs=new FileInputStream("src\\test\\resources\\Book1.xlsx")	;
	Workbook wb=WorkbookFactory.create(fs);
	Sheet sh=wb.getSheet("TC001");
	Row r=sh.getRow(1);
	Cell c=r.getCell(1);
	String value=c.getStringCellValue();
	System.out.println(value);
	
}
}
