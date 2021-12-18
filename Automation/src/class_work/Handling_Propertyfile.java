package class_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Handling_Propertyfile {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./data/commondata.property");// to get java program Representative object of the physicalFile(common data file)
		Properties p = new Properties(); //Create an object of Properties Class
		p.load(fis);//Load the file
		String url = p.getProperty("Url");    //get the data(or value ) by passing key(Url)
		String un = p.getProperty("Username"); //get the data(or value ) by passing key(User name)
		String pw = p.getProperty("Password"); //get the data(or value ) by passing key(password)
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
	}

}
		 																				