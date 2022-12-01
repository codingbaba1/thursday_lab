/*write a program to print reverse of an array.*/


package array_ANUDIP;

class TestArray 
{
	int arr[]=new int[]{1,2,3,4,5};
	void arrayPrint()
	{
		System.out.println("Original array: ");
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	void reverseArray()
	{
		System.out.println("\nReverse Array: ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
public class ReverseArray
{
	public static void main(String[]args)
	{
		TestArray arr=new TestArray();
		arr.arrayPrint();
		arr.reverseArray();
	}
	
}
