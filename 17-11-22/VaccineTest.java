
/*Ques: create class vaccine.create 2 concrete method firstDose() and 2ndDose().
Scenario 1:user can take first dose if user is Indian and age is 18.after vaccination user has to pay 250rs.
Scenario 2: user can take 2nd dose if already the first dose has completed.
Scenario 3: create class Bootstar dose and extend vaccine class.create static method boosterDose() 
in class Bootstar dose.if user has completed dose 1 and dose 2 then they are eligible for booster dose.*/



package oops_concept;

import java.util.Scanner;

class Vaccine 
{
	Scanner scan=new Scanner(System.in);
	String userCitizen;
	int userAge;
	void firstDose()
	{
		System.out.print("Enter Citizen: ");
		userCitizen =scan.nextLine();
		System.out.print("Enter Age: ");
		userAge =scan.nextInt();
		
		
		if((userCitizen=="Indian")&&(userCitizen=="indian")&&(userCitizen=="india")||(userAge>=18))
		{

			System.out.println("You are Eligible");
		}
		else
		{
			System.out.println("\nYou're not eligible! Your age is: "+userAge+"\n");
		}
		
	}
	void secondDose()
	{
		
		
	}

}
class BoosterDose extends Vaccine
{
	public static void boosterDose()
	{
		
	}
	
}
public class VaccineTest
{
	@SuppressWarnings("resource")
	public static void main(String[]args)
	{
		
		Vaccine vaccine=new Vaccine();
		vaccine.firstDose();
		while(true)
		{
			 
			
			
			
			
			
			
			Scanner scan=new Scanner(System.in);

			System.out.println("1. First Dose Vaccine");
			System.out.println("2. Secound Dose Vaccine");
			System.out.println("3. Booster Dose");
			System.out.println("0. Exit");
			System.out.print("Enter Choice : ");
			switch(scan.nextInt())
			{
				case 1:
					
					{
					
						System.out.println("****************************");
						System.out.println("       First Dose");
						System.out.println("****************************");
						System.out.println("Please pay full payment...");

						System.out.print("Pay ₹250: ");
						int rs=scan.nextInt();
						if(rs>=250)
						{
							System.out.println("Payment Successful...");
							System.out.println("Partially vaccineted!");
						}

					}
					break;

							
						
				case 2:
					
					{
						System.out.println("****************************");
						System.out.println("      Secound Dose");
						System.out.println("****************************");
						System.out.println("Please pay full payment...");
						System.out.print("Pay ₹250: ");
						int rs=scan.nextInt();
						if(rs>=250)
						{
							System.out.println("Payment Successful...");
							System.out.println("Fully vaccineted");
							System.out.println("****************************");
						
						}
						
					}
					
					break;
				case 3: 
				{
					System.out.println("****************************");
					System.out.println("      Boost Dose");
					System.out.println("****************************");
					System.out.println("Please pay full payment...");

					System.out.print("Pay ₹250: ");
					int rs=scan.nextInt();
					if(rs>=250)
					{
						System.out.println("****************************");
						System.out.println("Payment Successful...");
						System.out.println("Booster dose vaccineted successfull");
						System.out.println("You first take 1st and 2nd dose!");
					}

				}
					
					
				
				case 0:
					System.out.println("****************************");
					System.out.println("Thanks for visit...");
					System.out.println("****************************");
					break;
				default:
					System.out.println("****************************");
					System.out.println("Wrong input");
					System.out.println("****************************");
					break;
				
			}
		}		
	}
}
