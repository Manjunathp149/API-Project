package JavaPgm;

public class AmtPgm {

	
	public static void main(String[] args)
	{
		String s="Hello Manjunath";
		String[] str =s.split(" ");
		
		for(int i=0; i<str.length; i++)
		{
			String ck = str[i];
			for(int j=0; j<ck.charAt(i); j++)
			{
				if(str[i].equals(ck))
				System.out.println(ck);
			}
		}
		
	}
}
