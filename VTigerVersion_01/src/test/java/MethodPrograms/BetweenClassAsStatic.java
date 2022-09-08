package MethodPrograms;

 class circle{
 void area()
{
	int r=5;
	final double pi=3.142;
	double result=pi*r*r;
	System.out.println(result);
}
 }
 class BetweenClassAsStatic 
{
	public static void main(String[] args) 
	{
		new circle().area();
	}
}

