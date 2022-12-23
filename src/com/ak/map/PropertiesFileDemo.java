package com.ak.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertiesFileDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream reader=new FileInputStream("db.properties");
		  
		Properties prop=new Properties();
		  prop.load(reader);
		  
		  System.out.println("db user::"+prop.getProperty("dbuser"));
		  System.out.println("dp pass::"+prop.getProperty("dbpass"));
		  reader.close();
		
		
	}

}
