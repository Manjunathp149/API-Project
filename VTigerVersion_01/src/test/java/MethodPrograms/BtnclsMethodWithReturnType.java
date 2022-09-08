package MethodPrograms;

class cle
{
	static double area()
	{
		int r=5;
		final double pi=3.142;
		double result=pi*r*r;
		return result;
	}
	
}

class BtnclsMethodWithReturnType {
public static void main(String[] args) {
	double x =cle.area();
	System.out.println(x);
}
}
