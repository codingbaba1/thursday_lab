package test.java;

import java.util.Scanner;

public class FirstAndLastDigit {
	
	public static void main(String[]arg)
	{
		int num,first_digit, last_digit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter any numbers: ");
		num=sc.nextInt();
		first_digit=num;
		while(first_digit>=10)
		{
			first_digit=first_digit/10;
		}
		last_digit=num%10;
		System.out.println("\n The first digit of a given number is "+num+" = "+first_digit);
		System.out.println("\n The last digit of a given number is "+num+" = "+last_digit);
		sc.close();
	}

}
