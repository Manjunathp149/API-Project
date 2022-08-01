package com.crm.vtiger;

import java.util.Date;

public class Dateto {
	public static void main(String[] args) {
		Date date=new Date();
		String dateandtime=date.toString();
		//System.out.println(dateandtime);
		String yyyy=dateandtime.split(" ")[5];
		String DD=dateandtime.split(" ")[2];
		//String MM=dateandtime.split(" ")[1];
		@SuppressWarnings("deprecation")
		int MM=date.getMonth()+1;
		String Findformat=yyyy+" "+DD+" "+MM;
		System.out.println(Findformat);
		

		
}}
