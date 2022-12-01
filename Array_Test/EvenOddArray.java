/*4.write a program to count total number of odd and even numbers from an array.*/

package array_ANUDIP;

public class EvenOddArray 
{

	public static void main(String[] args) 
	{
		int arr[]={1,2,3,4,5,6,7,8,9};
		System.out.println("Even Numbers: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}

		System.out.println("\nOdd Numbers: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
