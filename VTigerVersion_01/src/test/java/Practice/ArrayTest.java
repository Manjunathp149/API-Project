package Practice;

public class ArrayTest {

	public static void main(String[] args) {
		String[] a= {"happy","hi","happy","happy"};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}
	
}
