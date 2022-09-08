package Practice;

public class Fibb {
public static void main(String[] args) {
	 int fib1=1;
	 int fib2=2;
	 int fib3=0;
	 
	 System.out.print(fib1+" "+fib2);
	 
	 for (int i = 1; i <10; i++) {
		fib3=fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		
		System.out.print(" "+fib3);
	}
}
}
