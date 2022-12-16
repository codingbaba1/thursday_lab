package shoppingKart_Project;

import java.util.Scanner;

public class ShoppingKartOperations 
{
	static Scanner sc=new Scanner(System.in);
	
	static void MainMenu()
	{
		int choice;
		System.out.println("\t~~~Welcome to Shopping Kart~~~");
		while(true)
		{
			System.out.println("******************************************");
			System.out.println("Enter 1. For Admin Panel\n"+"Enter 2. For User Panel\n"+"Enter 3. For Quit");
			System.out.println("******************************************\n");

			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				AdminPanel.adminOperation();
				break;
			case 2:
				UserPanel.UserOperation();
				break;
			case 3:System.exit(0);
				
			}
		}
	}

}
