package PracticeArrays;

import java.util.Arrays;
import java.util.TreeSet;

public class FindDuplicateInArraysTest
{
	public static void main(String[] args)
	{
	int [] a= { 8 ,7 ,5,5,0,0,0,7,7};
	
	int count= 0;
	TreeSet<Integer> set=new TreeSet<Integer>();
	for(int i=0;i<a.length;i++)
	{
		set.add(a[i]);
	}
	
	for(Integer it:set)
	{
			
		for(int i=0;i<a.length;i++)
		{
			if(it==a[i])
			{
				count++;
			}
			
		}
		
	}
	if(count>1)
	{
		System.out.println(Arrays.toString(a));
	}
	
	}
}
