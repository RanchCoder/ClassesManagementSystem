package com.ProjectClassFiles;

import java.util.*;
import java.sql.*;

 public class DatabaseConnector{
	 
	  public static String url="jdbc:mysql://localhost:3306/classesmanagementsystem";
	  public static String user="root";
	  public static String pass="root";
	  public static Connection con=null;
	  
	  public static Connection getConnection(){
		  
		  try{
			  
			   Class.forName("com.mysql.jdbc.Driver");
			   con=DriverManager.getConnection(url,user,pass);
			  
		  }
		  
		  catch(Exception e){
			  
			   e.printStackTrace();
			  
		  }
		  return con;
		  
	  }
	  
	  public static PreparedStatement getPreparedStatement(String query){
		  
		   PreparedStatement psmt = null;
		   try{
			   
			   con  = getConnection();
			   psmt = con.prepareStatement(query);
			   
		   }
		   
		   catch(Exception e){
			   
			    e.printStackTrace();
			   
		   }
		   
		   return psmt;
		  
	  }
	  
	  public static ResultSet getResultSet(String query){
		  
		ResultSet rs = null ;

	 try{
	       con = getConnection();

		   Statement st = con.createStatement();

		   rs = st.executeQuery(query);
		   
	     }
	 
	   catch(Exception e){
	   
	     e.printStackTrace();
		 	    
	   }

	   return rs;  
		  
		  
	  }
	 
	 
 }