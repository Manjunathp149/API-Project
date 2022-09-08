package Practice;

public class Add2ArrayTest {
public static void main(String[] args) {
	
	int[] a= {1,2,3,4};
	int[] b= {1,2,4,5,6,8};
	
	int count=a.length;
	if(b.length>a.length)
	{
		count =b.length;
	}
	
	for(int i=0;i<count;i++)
	{
		try {
			System.out.print(a[i]+b[i]+" ");
		} catch (Exception e) {
			if(b.length>a.length)
			{
				System.out.print(b[i]+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
}
