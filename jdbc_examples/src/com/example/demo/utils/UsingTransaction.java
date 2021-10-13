package com.example.demo.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Savepoint;

public class UsingTransaction {

	public static void main(String[] args) {
		Connection con=DbConnection.getOracleConnection();
		
		try {
			con.setAutoCommit(false);
			String sql="insert into student(rollNumber,syudentName,markScored)"+"values(201,'tom',56)";
			PreparedStatement pstmt1=con.prepareStatement(sql);
			pstmt1.executeUpdate();
			Savepoint sp1=con.setSavepoint("sp1");
			String sql2="insert into student(rollNumber,syudentName,markScored)"+"values(202,'tomcom',86)";
			PreparedStatement pstmt2=con.prepareStatement(sql2);
			pstmt2.executeUpdate();
			Savepoint sp2=con.setSavepoint("sp2");
			String sql3="insert into student(rollNumber,syudentName,markScored)"+"values(203,'pom',56)";
			PreparedStatement pstmt3=con.prepareStatement(sql3);
			pstmt3.executeUpdate();
			Savepoint sp3=con.setSavepoint("sp3");
			con.rollback(sp3);
			con.commit();
			System.out.println("done");
			
					
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
