/*3.Explain run time polymorphism with a real time scenario.*/


package lab221222;

class Bike
{
	void run()
	{
		System.out.println("Running");
	}
}

class Splendor extends Bike
{

	void run()
	{
		System.out.println("running safely with 60km");
	}
}
public class RunTimePolymorphism
{
	public static void main(String[] args) 
	{
		Bike b=new Splendor();
		b.run();
	}

}
