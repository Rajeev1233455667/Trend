package com.trend.genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.github.dockerjava.api.model.Driver;
import com.mysql.cj.xdevapi.Statement;

public class DatabaseUtility {
	  private Connection connection;
	  private Driver dbdriver;
	  /**
	   * @param query
	   * @param coloumnName
	   * @return
	   * @throws SQLException 
	   * @throws SQL Exception
	   */
	  
	  public List<String>getDataFromDatabase(String query,String columnName) throws SQLException
	  {
	    java.sql.Statement statement = connection.createStatement();
	    ResultSet result = statement.executeQuery(query);
	   List<String> list=new ArrayList<String>();
	   while(result.next())
	   {
	     list.add(result.getString(columnName));
	   }
	  
	  return list;
	    
	}
	  
	  public void openDBConnection(String dbURL,String dbUserName,String dbPassword)throws SQLException
	  {
	     dbdriver=new Driver();
	  //  DriverManager.registerDriver((dbdriver));
	    connection=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
	  }
	  
	  public void closeDB() throws SQLException
	  {
	    connection.close();
	  }
	  
	  public void modifyDataIntoDatabase(String query) throws SQLException
	  {
	    java.sql.Statement statement = connection.createStatement();
	    statement.executeQuery(query);
	  }
	  
	  public boolean verifyDataInDatabase(String querry,String columnName,String expectedData) throws SQLException
	  {
	    List<String> list=getDataFromDatabase(querry,columnName);
	    boolean flage=false;
	    if(list.contains(expectedData)) flage=true;
	    return flage;
	  }
	  
	  
	  
	}





