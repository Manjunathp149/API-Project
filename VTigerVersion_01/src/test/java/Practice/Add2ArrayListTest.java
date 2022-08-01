package Practice;

import java.util.ArrayList;

public class Add2ArrayListTest {

	
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add("manju");
		
		System.out.println(a);
		
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add("manju");
		 a.addAll(a1);
		System.out.println( a);
		
	
	}
}
