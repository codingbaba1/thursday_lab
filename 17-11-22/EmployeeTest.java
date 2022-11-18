package oops_concept;

class Person3
{
	String name;
	void setData(String name)
	{
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
class Empl extends Person3
{
	double anualSalary;
	String nationalInsuranceNo;
	int yearOfStartedWork;
	
	public Empl(String name, double anualSalary, String nationalInsuranceNo, int yearOfStartedWork)
	{
		super.name=name;
		this.anualSalary=anualSalary;
		this.nationalInsuranceNo=nationalInsuranceNo;
		this.yearOfStartedWork=yearOfStartedWork;
		
	}

	public double getSalary() {
		return anualSalary;
	}

	public void setSalary(double salary) {
		this.anualSalary = salary;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}

	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public int getYearOfStartedWork() {
		return yearOfStartedWork;
	}

	public void setYearOfStartedWork(int yearOfStartedWork) {
		this.yearOfStartedWork = yearOfStartedWork;
	}
	
	

	
	
}


public class EmployeeTest 
{

	public static void main(String[] args) 
	{
		Empl emp=new Empl("imran",350000,"UPNI52458642",2016);
		System.out.println("Name: "+emp.getName()+"\nAnual Salary: "+emp.getSalary()+"\nnational Insurance No: "+emp.getNationalInsuranceNo()+"\nyear Of Started Work: "+emp.getYearOfStartedWork());
		
		System.out.println("=====================");
		Empl emp1=new Empl("Ayan",568000,"UPNI0005642",2019);
		System.out.println("Name: "+emp1.getName()+"\nAnual Salary: "+emp1.getSalary()+"\nnational Insurance No: "+emp1.getNationalInsuranceNo()+"\nyear Of Started Work: "+emp1.getYearOfStartedWork());
		

	}

}
