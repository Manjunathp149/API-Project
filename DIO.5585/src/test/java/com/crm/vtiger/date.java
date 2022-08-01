package com.crm.vtiger;

import java.io.IOException;

import GenericUtilities.JavaUtilities;
import GenericUtilities.ReadAndWrite;

public class date {
public static void main(String[] args) throws IOException, Throwable {
	JavaUtilities j=new JavaUtilities();
	ReadAndWrite rw=new ReadAndWrite();
	String l=j.getSystemDateAndTimeInISTFormat();
	String l1=j.getSystemYeardatemonthFormat();
	System.out.println(l);
	System.out.println(l1);
	
	//String s=rw.Readfromexcel("Products", 1, 1);
	rw.writeinexcel("Products", 0, 0, "Hello00");
//	System.out.println(s);
	//System.out.println(s);
}
}
