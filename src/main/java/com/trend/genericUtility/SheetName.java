package com.trend.genericUtility;

public enum SheetName {
	ADDRESS("Address");
	private String sheetname;
	//setter
	private SheetName(String sheetname)
	{
		this.sheetname=sheetname;
	}
//getter
	public String ConvertToString()
	{
		return sheetname.toString();
	}
}
