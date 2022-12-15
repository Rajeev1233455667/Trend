package com.trend.genericUtility;

public enum PropertyFileKeys {
BROWSER("browser"),URL("url"),MAIL("mail"),PASSWORD("password"),TIMEOUT("timeout");
	private String keys;
	//setter
	private PropertyFileKeys(String keys) {
		this.keys=keys;
		
	}
	//getter
	public String convertToString() {
		return keys.toString();
	}
	
}
