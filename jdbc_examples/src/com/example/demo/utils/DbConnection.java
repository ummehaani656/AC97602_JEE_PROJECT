package com.example.demo.utils;
import java.sql.*;
public class DbConnection {
     public static Connection getOracleConnection() {
    	 Connection con=null;
    	 
    	 try {
    		 String url="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    		 con=DriverManager.getConnection(url,"hr","hr");
    		 
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    	 }
    	 
    	 
    	 return con;
     }
}
