/*2.Find out the sum of all digits from an alpha numeric string.
hello123*/

package lab221222;

class Test {
 
	String str;
    void getSumOfNumbers(String str) {
        String[] a = str.replaceAll("[^0-9]","").split("");
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + Integer.parseInt(a[i]);
        System.out.println("Sum of Digit in String:  "+sum);
    }
}


public class FindSumOfDigitInString 
{
	

	public static void main(String[] args)
	{
		//Scanner sc=new Scanner(System.in);
		Test t=new Test();
		//System.out.print("Enter Something: ");
		//sc.next();
       t.getSumOfNumbers("hello123");
       //sc.close();
	}

}
