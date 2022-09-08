package MethodPrograms;

 class ircle
 {
	 void area(int r) {
		final double pi=3.142;
		double result=pi*r*r;	
	System.out.println(result);
	}
}

class BtnclsMethodWithParameter {
	public static void main(String[] args) {
		new ircle().area(5);
	}
}

