package oops_concept;

class Student1
{
	
	int id;
	String name,address,course;
	float fees;
	long contact;
	
	//method for set student data
	void setData(int id, String name,String address,long contact,String course,float fees)
	{
		
		
		this.id=id;
		this.name=name;
		this.address=address;
		this.contact=contact;
		this.course=course;
		this.fees=fees;
		
	}
	//display method use show/display student data
	void displayData()
	{
		System.out.println("Id: "+id+"\n"+"Name: "+name+"\n"+"Address: "+address+"\n"+"Contact No.: "+contact+"\n"+"Course: "+course+"\n"+"Fees: "+fees);
		
	}
}