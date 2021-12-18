package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author Ravi
 *
 */

public class Filelib
{
	/**
	 * This is the generic method to read the data from external Property File.
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	/**
	 * This is the generic method to red the data from Excel file.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExcelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return data;
		
	}
	/**
	 * This is generic method for writting the data to Excel file.
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param data
	 * @return 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void setExcelData(String sheetname,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./data/testscript.xlsx");
		 Workbook wb = WorkbookFactory.create(fis);
		 wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(data);
		 FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		 wb.write(fos);
		 wb.close();	 
		
	}

}
