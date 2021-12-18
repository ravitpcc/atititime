package com.actitime.generics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class demo {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		Filelib f = new Filelib();
		
		System.out.println(f.getPropertyData("Url"));
		System.out.println(f.getExcelData("Create_Customer", 1, 4));
		
		//System.out.println(f.setExcelData("Create_Customer", 1, 5, "pass"));
	
		
	}

}