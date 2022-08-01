package com.crm.vtiger;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ToReadDataFromDatabase {
public static void main(String[] args) throws SQLException {
	//Register
	Driver DriverReference=new Driver();
	DriverManager.registerDriver(DriverReference);
	//connection
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects","root","root");
 Statement statement=connection.createStatement();
//create
 String Query="select * from project";
 ResultSet result=statement.executeQuery(Query);
//execute
 try {
	while(result.next())
 {
	 System.out.println(result.getString(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4)+" "+result.getString(5)+" "+result.getString(6));
	 
 }}
catch (Exception e)
 {
 }
	 finally {
		 connection.close();
		 System.out.println("Data is closed");
	 }
}}
