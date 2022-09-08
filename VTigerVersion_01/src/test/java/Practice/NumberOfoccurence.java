package Practice;

public class NumberOfoccurence {
public static void main(String[] args) {
	int num=101010;
	int count=0;
	while(num>0)
	{
		int rem=num%10;
		if(rem==1)
		{
			count++;
		}
	num=num/10;
	}
	System.out.println(count);
}
}
