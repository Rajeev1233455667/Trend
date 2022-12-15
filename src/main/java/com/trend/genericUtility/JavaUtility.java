package com.trend.genericUtility;

import java.sql.Date;

public class JavaUtility {
	/**
	 * this contain java resuable metod
	 * @param s
	 * @param strategy
	 * @return
	 */
	
public Object stringToAnyDataType(String s,String strategy) {
	/**
	 * convert String to data
	 */
	Object convertedData=null;
	if(strategy.equals("int")) {
		convertedData=Integer.parseInt(s);
		}
	else if(strategy.equals("long")) {
		convertedData=Long.parseLong(s);
	}
	return convertedData;
	/**
	 * this method is used to generate ranndom method
	 */
	/*public  int getRandomNumber(int limit) {
		int randomNumber=new Random().nextInt(limit);
		return randomNumber*/
	}
/*public String getSystemDateWithFormate() {
	Date date=new Date();
	String YYYY=dateAndTime.split("")[5];
	String DD=dateAnd*/
}
	


