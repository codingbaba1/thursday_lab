package oops_concept;

import java.util.Scanner;

public class EmployeeSalaryMain {

	public static void main(String[] args) {
		int id;
		String name,designation;
		float salary,ta;
		Scanner sc=new Scanner(System.in);
		EmployeeSalary emp=new EmployeeSalary();
		System.out.print("enter employee id: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("enter employee name: ");
		name=sc.nextLine();
		System.out.print("enter employee designation: ");
		designation=sc.nextLine();
		System.out.print("enter employee salary: ");
		salary=sc.nextFloat();
		
		/*switch(designation)
		{
		case "manager": ta=2000;
		break;
		
		case "Manager": ta=2000;
		break;
		
		default: ta=1500;
			
		}*/
		System.out.println("=============================");
		emp.setData(id, name, designation, salary);
		emp.displayData();

	sc.close();

	}

}
