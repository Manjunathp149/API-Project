package com.Database.PracticeTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class FetchDataFromDataBaseTest {
public static void main(String[] args) throws SQLException {
	
	
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
	
	
	Statement stat = conn.createStatement();
	ResultSet query = stat.executeQuery(" select * from project;");
	
	while(query.next())
	{
		System.out.print(query.getString(1)+" "+query.getString(2)+" "+query.getString(3)+" "+query.getString(4)+" "+query.getString(5)+" "+query.getString(6)+" ");
	}
}
}
