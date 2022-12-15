package com.trend.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * this class is contains excel reusable methods
 * @author Rajeev
 *
 */
public class ExcelUtility {
private Workbook workbook=null;
private FileInputStream fisExcel=null;
public String getDataFromExcel(String excelPath,String sheetName,int rowNumber,int cellNumber)
{
	String data=null;
	try {
	fisExcel=new FileInputStream(excelPath);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	try {
		workbook=WorkbookFactory.create(fisExcel);
		DataFormatter df=new DataFormatter();
		data=df.formatCellValue(workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber));
	} catch (EncryptedDocumentException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
//	DataFormatter dcd=new DataFormatter();
	//String data=df.formatCellValue(workbook.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber));
	return data;
	
}
/**
 * this method is used to close the excel
 */
public void closeExcel() {
	try {
		workbook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		fisExcel.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
