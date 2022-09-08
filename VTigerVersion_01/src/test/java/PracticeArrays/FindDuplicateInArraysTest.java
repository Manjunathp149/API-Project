package PracticeArrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FindDuplicateInArraysTest
{
	public static void main(String[] args)
	{
	int [] a= { 8 ,7 ,5,5,0,0,0,7,7};
	
	
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}
	
	for(Integer it:set)
	{
		int count= 0;	
		for(int i=0;i<a.length;i++)
		{
			if(it==a[i])
			{
				count++;
				//,break;
			}
			if(count>1)
			{
				System.out.print(a[i]+" ");
			}	
		}
		
		
	}
	
	}
}
