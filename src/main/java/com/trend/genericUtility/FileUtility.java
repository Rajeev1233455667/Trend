package com.trend.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
private FileInputStream fis;
/**
 * this method is used to fetch data from property file
 * @param propertyFilePath
 * @param key
 * @return
 */
public String getDataFromPropertyFile(String propertyFilePath,String  key)
{
	try {
		fis=new FileInputStream(propertyFilePath);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
		Properties property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		String value=property.getProperty(key).trim();
       		
	
	
	
	return value;
	
}
/**
 * this method is used to close the property file
 */
public void closePropertyFile() {
	try {
		fis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
