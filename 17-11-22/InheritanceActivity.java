package oops_concept;

class Employeee
{
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary,specialAllowance=250.80,HRA=1000.50,transportAllowance;
	Employeee(long id,String name,String address, long phone )
	{
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		
	}
	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	void calculateSalary()
	{
		double salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*HRA/100);
		
		System.out.println("Calculated  salary: "+salary);
	}

	double calculateTransportAllowance()
	{
		
		return transportAllowance=10/100*basicSalary;
		/*double transportAllowance=10/100*basicSalary;
		System.out.println("TransportAllowance: "+transportAllowance);*/
	}
}
class Manager extends Employeee
{
	Manager(long id, String name,String address, long phone,double salary)
	{
		super(id, name, address, phone);
		this.basicSalary=salary;
		
		
		
	}
	double calculateTransportAllowance()
	{
		
		return transportAllowance=15*basicSalary/100;
	}
	
}
class Trainee extends Employeee
{
	Trainee(long id, String name, String address, long phone, double salary)
	{
		super(id,name, address, phone);
		this.basicSalary=salary;
	
	}
	double calculateTransportAllowance()
	{
		
		return transportAllowance=10*basicSalary/100;
	}

}
public class InheritanceActivity 
{

	public static void main(String[] args) 
	{	
		System.out.println("==========Manager==========");
		Manager manager=new Manager(126534,"Peter","Chennai India",237844l,65000d);
		System.out.println("Id: "+manager.getEmployeeId()+"\nName: "+manager.getEmployeeName()+"\nAddress: "+manager.getEmployeeAddress()+"\nPhone: "+manager.getEmployeePhone()+"\nBasicSalary: "+manager.getBasicSalary());
		manager.calculateSalary();
		System.out.println("TransportAllowance: "+manager.calculateTransportAllowance());
	
		System.out.println("==========Trainee==========");
		Trainee trainee=new Trainee(29846,"jack", "Mumbai India",442085l,45000d);
		System.out.println("Id: "+trainee.getEmployeeId()+"\nName: "+trainee.getEmployeeName()+"\nAddress: "+trainee.getEmployeeAddress()+"\nPhone: "+trainee.getEmployeePhone()+"\nBasicSalary: "+trainee.getBasicSalary());
		trainee.calculateSalary();
		System.out.println("TransportAllowance: "+trainee.calculateTransportAllowance());


		

	}

}
/*double transportAllowance=15*basicSalary/100;
System.out.println("TransportAllowance: "+transportAllowance);*/
