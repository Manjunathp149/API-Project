package PracticeArrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindFirstMax {

	
/*	public static void main(String[] args)
	{
	int[] a={1,2,5,7,3,9};
	int min=a[0];

	for(int i=0;i<a.length;i++)
	{
	if(min>a[i])
	{
	min=a[i];
	}
	}
	System.out.println(min);
	}*/
	

/*public static void main(String[] args)
{
int[] a={1,2,4,6,2,1};

LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
for(int i=0;i<a.length;i++)
{
set.add(a[i]);
}

for(Integer it:set)
{
for(int i=0;i<a.length;i++)
{
if(it<a[i])
{
System.out.println(it+" "+i);
break;
}
}}}*/
	
	
	public static void main(String[] args)
	{
	int [] a= {8,2,3,7,5,5,7,7};
	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
     for(int i=0;i<a.length;i++) {
    	 set.add(a[i]);
     }
      for(Integer data:set) {
    	 int count=0;
    	
    	  for(int i=0;i<a.length;i++) {
    		  if(data==a[i]) {
    			  count++;
    			  
    			   if(count==1) {
    				  System.out.println(data+"="+i);
    			  }
    			  
    			   }
    		
    	  }
    	  
      }
	 }
	}
	

