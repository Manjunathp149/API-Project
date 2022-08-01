package Practice;

public class CheckPalindromeNumber {

	
	public static void main(String[] args) {
		int num=123;
		int rev=0;
		int num1=num;
		
		while(num>0)
		{
		 	rev=rev*10+num%10;
		 	num=num/10;
		}
		System.out.println(rev);
		if(num1==rev)
		{
			System.out.println("The number is a palindrome");
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}
		
	}
	
}
