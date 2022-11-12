package oops_concept;

import java.util.Scanner;

public class Bank {
	float total=10000,withdrawal,deposit;
	char ch;
	Scanner sc=new Scanner(System.in);

	void withdrawn()
	{

		System.out.println("===============================");
		
		System.out.print("Enter withdrawal amount: ");
		withdrawal=sc.nextFloat();
			
		if(total>=withdrawal)
		{
			total=total-withdrawal;
			System.out.println("Withdran Amount is: "+withdrawal+"\nafter withdrawan Current balance = "+total);
		}
		else
		{
			System.out.println("You can not withdrawan insufficiant balance: "+withdrawal+"\nyour balance is: = "+total);
		}
		
	}
	
	
	void deposit()
	{
		System.out.print("Enter deposit amount: ");
		deposit=sc.nextFloat();
		total=total+deposit;
		System.out.println("Deposited Amount is: "+deposit+"\nafter deposit Current Balance: = "+total);
	}
	
	

}
