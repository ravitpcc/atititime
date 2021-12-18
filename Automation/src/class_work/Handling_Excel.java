package class_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Handling_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");//Get the java representative object of physical File
		//Create a Workbook or Load the file
		Workbook wb = WorkbookFactory.create(fis);
		//Get  the control of the sheet,Row,Cell(column) then read the data
		String data = wb.getSheet("Create_Customer").getRow(1).getCell(4).toString();
		System.out.println(data);



	}

}
