package com.company.surveymanagement.dbutil;

/**
 * 
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;

import java.sql.SQLException;
import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import oracle.jdbc.pool.OracleDataSource;

import com.igate.surveymanagement.Exception.SurveyException;



/**
 * @author trgl1
 *
 */
public class DataBaseUtil {

	public static Connection getDb() throws NamingException, SQLException
	{
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource)ic.lookup("java:/OracleDS");
		return ds.getConnection();
	}
	
	
	
	
	
	/*private static Connection con;
	static DataBaseUtil dbutil = null;
	
	
	
	*//**
	 * @throws MobileException 
	 * 
	 *//*
	private DataBaseUtil() throws SurveyException  {
		// TODO Auto-generated constructor stub
		
		try 
		{
			
			FileInputStream fis = new FileInputStream("jdbc.properties");
			Properties pro = new Properties();
			pro.load(fis);
	
			
			OracleDataSource ods=new OracleDataSource();
			ods.setDriverType(pro.getProperty("drivername"));
			ods.setURL(pro.getProperty("url"));
			ods.setUser(pro.getProperty("username"));
			ods.setPassword(pro.getProperty("password"));
			con=ods.getConnection();
		} 
		catch (FileNotFoundException e)
		{
			
			throw new SurveyException("Property file not found Exception");
			
		}
		catch (IOException e) 
		{
			
			throw new SurveyException("Property file loading Exception"+e.getMessage());
			
		} 
		
		catch (SQLException e)
		{
			
			throw new SurveyException("Connection establishing error"+e.getMessage());
		}
	}
	
	
	public static DataBaseUtil getInstance() throws SurveyException{	//factory method
		
		if(dbutil == null)
		{
			dbutil = new DataBaseUtil(); 
			return dbutil;
		}
		else
		{
			return null;
		}
		
	}
	
	public Connection getDBConnection(){
		
		return con;
	}
	
	public static void  releaseConnection() throws SurveyException{
		
		try {
			con.close();
			dbutil = null;
		} catch (SQLException e) {
		
			throw new SurveyException("Connection closing prob"+e.getMessage());
		}
		
	}*/
}
