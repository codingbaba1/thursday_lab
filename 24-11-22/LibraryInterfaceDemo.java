package oops_concept;

interface LibraryUser
{
	public void registerAccount(int age);
	public void requestBook(String bookType);
	
	
}
class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	@Override
	public void registerAccount(int age) 
	{
		if(age<12)
		{
			System.out.println("You have successfully registered under a Kids Account");
			
		}
		else
		{
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
			
		}
		
	}

	@Override
	public void requestBook(String bookType) 
	{
		if(bookType=="Kids")
		{
			System.out.println("Book Issued successfully, please return the book within 10 days");
			
		}
		else
		{
			System.out.println("Oops, you are allowed to take only kids books");
			
		}
		
	}
	
}
class AdultUser implements LibraryUser
{
	int age;
	String bookType;

	@Override
	public void registerAccount(int age) 
	{
		if(age>12)
		{
			System.out.println("You have successfully registered a Adult Account");
			
		}
		else
		{
			System.out.println("“Sorry, Age must be greater than 12 to register as a Adult");
			
		}
		
				
	}

	@Override
	public void requestBook(String bookType)
	{
		if(bookType=="Fiction")
		{
			System.out.println("Book Issued successfully, please return the book within 7 days");
			
		}
		else
		{
			System.out.println("Oops, you are allowed to take only Fiction books");
			
		}
		
	}
	
}

public class LibraryInterfaceDemo 
{

	public static void main(String[] args) 
	{
		KidUsers kid=new KidUsers();
		kid.registerAccount(10);
		kid.requestBook("Kids");
		System.out.println("===============================================");
		AdultUser adult=new AdultUser();
		adult.registerAccount(23);
		adult.requestBook("Fiction");

	}

}
