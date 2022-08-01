import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel {
public static void main(String[] args) throws IOException, Throwable {
//ReadAndWrite RW=new ReadAndWrite();
//RW.writeinexcel("Contacts", 1, 0, "Hihelloka");
	
	FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sh=wb.getSheet("Contacts");
	Row R=sh.getRow(1);
	Cell c=R.getCell(0);
	c.setCellValue("super");
	FileOutputStream fos=new FileOutputStream("./src/test/resources/Book1.xlsx");
	wb.write(fos);
}
}
