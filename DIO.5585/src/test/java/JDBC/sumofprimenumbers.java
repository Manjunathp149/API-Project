package JDBC;

public class sumofprimenumbers {
public static void main(String[] args) {
	int count=0;
	for(int i=3;i<100;i++)
	{
		for(int j=i+1;j<i;j++)
		{
			if(i%j==0) 
			{
				count++;

			}
		}
		if(count==0)
		{
			System.out.println(i);
		}
	}
	
	}
}
		