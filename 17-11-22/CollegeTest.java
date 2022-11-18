package oops_concept;

class Person4
{
	String name,dateOfBirth;
	public Person4(String name, String dateOfBirth)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
class Teacher extends Person4
{
	double salary;
	String subject;
	
	public Teacher(String name, String dateOfBirth,double salary, String subject)
	{
		super(name,dateOfBirth);
		
		this.salary=salary;
		this.subject=subject;
		
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
class Student4 extends Person4
{
	int studentId;
	public Student4(String name, String dateOfBirth,int studentId)
	{
		super(name,dateOfBirth);
		
		this.studentId=studentId;
		
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
class College extends Student4
{
	String collegeName,studyingYear;
	public College(String name, String dateOfBirth, int studentId, String collegeName,String studyingYear )
	{
		super(name,dateOfBirth, studentId);
		this.collegeName=collegeName;
		this.studyingYear=studyingYear;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getStudyingYear() {
		return studyingYear;
	}
	public void setStudyingYear(String studyingYear) {
		this.studyingYear = studyingYear;
	}
	
}

public class CollegeTest 
{

	public static void main(String[] args) 
	{
		System.out.println("=============================================");
		Person4 p=new Person4("Pihu","10-12-1998");
		System.out.println("Name: "+p.getName()+"\nDate of Birth: "+p.getDateOfBirth());
		System.out.println("=============================================");
		Teacher t=new Teacher("Ayat","14-02-1999",25000,"Java");
		System.out.println("Name: "+t.getName()+"\ndate of Birth: "+t.getDateOfBirth()+"\nSalary: "+t.getSalary()+"\nTeaches Subject: "+t.getSubject());
		System.out.println("=============================================");
		Student4 s=new Student4("Rupesh","30-05-2001",102);
		System.out.println("Name: "+s.getName()+"\ndate of Birth: "+s.getDateOfBirth()+"\nStudent Id: "+s.getStudentId());
		System.out.println("=============================================");
		College c=new College("Priya","08-01-2001",201,"M.M.H. College","second");
		System.out.println("Name: "+c.getName()+"\ndate of Birth: "+c.getDateOfBirth()+"\nStudent Id: "+c.getStudentId()+"\nCollege Name: "+c.getCollegeName()+"\nYear of Studying: "+c.getStudyingYear());



	}

}
