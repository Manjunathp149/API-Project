package Practice;

public class CheckPalindrome {
public static void main(String[] args)
{
	String s="ahaaha";
	String rev="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.println("its is a palindrome");
	}
	else
	{
		System.out.println("No its not a palindrome");
	}
}
}
