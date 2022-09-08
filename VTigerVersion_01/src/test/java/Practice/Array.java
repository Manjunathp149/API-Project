package Practice;

import java.util.ArrayList;

public class Array {
public static void main(String[] args) {
	
	ArrayList<Object> l1=new java.util.ArrayList<Object>();
	l1.add(10);
	l1.add(10+65);
	l1.add("Manju");
	l1.add(null);
	//System.out.println(l1);
	
	ArrayList<Object> l2=new java.util.ArrayList<Object>();
	l2.add(21);
	l2.add(15+65);
	l2.add("Team");
	l2.add("status");
	//System.out.println(l2);
	//l1.addAll(l2);
	l2.removeAll(l1);
	//System.out.println(l1);
	System.out.println(l2);
	
	
}
}
