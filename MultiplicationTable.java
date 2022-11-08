package test.java;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter a number: ");
		n=sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+"*"+i+" = "+n*i);
		}
		sc.close();
		
	}

}
