package Practice;

public class PracticeTest {
public static void main(String[] args) {
	
	
	String s="Hi i am manjunath";
	String[] s1 = s.split(" ");
	
	
	for(int i=s1.length-1;i>=0;i--)
	{
		System.out.print(s1[i]+" ");
	}
}
}
