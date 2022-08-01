package PracticeArrays;

public class MissingNumberInArrayTest {

	public static void main(String[] args) {
		
		int [] a= {1,5,6,8,10};
		
		for(int i=1;i<a.length;i++)
		{
			
				if(a[i+1]!=i)
				{
					System.out.println(i);
				}
			}
		}
	}

