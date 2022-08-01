package PracticeArrays;

public class PrintFirst3MaxNumInArrayTest {

	public static void main(String[] args) {
		int [] a= {-1,5,36,27,6};
		
		int fmax=a[0];
		int Smax=a[0];
		int Tmax=a[0];

		for(int i=1;i<a.length;i++)
		{
			if(fmax<a[i])
			{
				Tmax=Smax;
				Smax=fmax;
				fmax=a[i];
			}
			else if(fmax>a[i])
			{
				Smax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(Smax);
	}
}
