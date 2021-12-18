package class_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Handling_Excel_File_Anotherway 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis =new FileInputStream("./data/testscript.xlsx");
		//Create an workbook on load thefile
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet
		Sheet sheet = wb.getSheet("Create_Customer");
		//get the control of the row
		 Row row = sheet.getRow(1);
		 //get the control of cell
		 Cell cell = row.getCell(4);
		 //Read the data 
		 String data = cell.toString();
		 //print it on the console
		 System.out.println(data);
		 
		
		
	}

}
