package TestsByGenericUtilitis;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetMulltitpleDataFromExcel {
	public static void main(String[]args) throws Throwable, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Watch");
		//Object[][] arr=new Object[sh.getLastRowNum()+1][sh.getRow(0).getLastCellNum()];
		for(int i=0;i<=sh.getLastRowNum();i++){
			for(int j=0;j<sh.getRow(0).getLastCellNum();j++) {
				//arr[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			//}
			
		}
		
	}

}
}