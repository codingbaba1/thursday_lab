package oops_concept;

import java.util.Scanner;

//create StudentMain class 
public class StudentMain1{
	

	public static void main(String[]arg)
	{
		Scanner sc=new Scanner(System.in);
		//create a obj. st of Student class 
		Student1 st=new Student1();
		int id,n;
		String name,address,course;
		long contact;
		float fees;
		
		System.out.print("Enter number of Student you want: ");
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("========================================");
		
		//System.out.println(st);// address of memory
		System.out.print("Enter Id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Name: ");
		name=sc.nextLine();
		System.out.print("Enter Address: ");
		address=sc.nextLine();
		System.out.print("Enter Contact No.: ");
		contact=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter Course: ");
		course=sc.nextLine();
		System.out.print("Enter Fees: ");
		fees=sc.nextFloat();
		
		st.setData(id,name,address,contact,course,fees);
		st.displayData();
		}
		
		/*System.out.println("****************************");
		st.setData(102, "Shahil", "Noida",8754263501l, "java full stack", 2000.0f);
		//st.setData();
		st.displayData();*/
		sc.close();
		
		
	}
}