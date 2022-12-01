/*2.write a program to print all negative numbers in an array.*/


package array_ANUDIP;

import java.util.Scanner;

class TestArray1
{
	private static Scanner sc;
	int size,i;
	
	void negative_Arr()
	{
		sc=new Scanner(System.in);
		System.out.println("Please enter the NEG Array size: ");
		size=sc.nextInt();
		int[]Neg_arr=new int[size];
		
		System.out.println("enter NEG array elements: "+size);
		for(i=0;i<size;i++)
		{
			Neg_arr[i]=sc.nextInt();
		}
		System.out.println("list of Negative Numbers in Neg. array: ");
		for(i=0;i<size;i++)
		{
			if(Neg_arr[i]<0)
				System.out.print(Neg_arr[i]+" ");
		}
		
	}
}

public class NegativeArray 
{

	public static void main(String[] args) 
	{
		TestArray1 arr=new TestArray1();
		arr.negative_Arr();

	}

}
