package MethodPrograms;

public class MethodWithReturnType {
static double area()
{
	int r=5;
	final double pi=3.142;
	double result=pi*r*r;
	return result;
}
public static void main(String[] args) {
	//double x=area();
	System.out.println(area());
}
}
