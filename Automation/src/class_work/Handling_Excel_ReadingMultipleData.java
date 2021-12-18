package class_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Handling_Excel_ReadingMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		  int rowcount = wb.getSheet("InvalidLogin").getLastRowNum();
		  for(int i=1;i<=rowcount;i++)
		  {
			  String un = wb.getSheet("InvalidLogin").getRow(i).getCell(0).toString();
			  String pw = wb.getSheet("InvalidLogin").getRow(i).getCell(1).toString();
			  System.out.println(un+"\tab"+pw);
		  }
		
		
		

	}

}
