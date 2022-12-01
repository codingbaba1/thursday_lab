/*3.write a program to find minimum and maximum of an array.*/

package array_ANUDIP;

import java.util.*;

class MinMAx 
{
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int size = 0;
	       System.out.println("Enter size of array: ");
	       size =sc.nextInt();
	       int arr[]=new int[size];

	       System.out.println("Enter elements in array");
	       int min=Integer.MAX_VALUE;
	       int max=Integer.MIN_VALUE;
	       for(int i=0;i<size;i++)
	       {
	         arr[i]=sc.nextInt();
	         if(arr[i]<min)
	           {
	           min=arr[i];
	           }
	         if(arr[i]>max)
	         {
	           max=arr[i];
	         }
	       }
	       System.out.println("Maximum element is "+min);
	       System.out.println("Minimum element is "+max);
	       sc.close();
	}
	
}

