package oops_concept;

import java.util.Scanner;

public class EmployeeSalary {
	
	Scanner sc=new Scanner(System.in);
	int id;
	String name, designation;
	float basicSalary,anual_salary,ta,total;
	void setData(int id,String name,String designation,float basicSalary)
	{
		this.id=id;
		this.name=name;
		this.designation=designation;
		this.basicSalary=basicSalary;
		
		anual_salary=basicSalary*12;
		
		
		switch(designation)
		{
		case "manager": ta=2000;
		
		break;
		case "Manager": ta=2000;
		break;
		
		default: ta=1500;
		}
		total=anual_salary+ta;
	}
	void displayData()
	{
		System.out.print("Employee Id: "+id+"\nEmployee Name: "+name+"\nDesignation: "+designation+"\nAnual Salary: "+anual_salary+"\nTravel Allowvance: "+ta+"\nTotal Salary with travel allowance is: "+total);
	}
	
	

}
