package oops_concept;

class Animal
{
	public void eat()
	{
		System.out.println("Eat method");
		
	}
	public void sleep()
	{
		System.out.println("Sleep method");
	}
}
class Bird extends Animal
{
	public void fly()
	{
		
		super.eat();
		super.sleep();
		System.out.println("Fly method");
	}
}

public class AnimalTest 
{

	public static void main(String[] args) 
	{
		Animal animal=new Animal();
		animal.eat();
		animal.sleep();
		
		System.out.println("=========================");
		Bird bird=new Bird();
		bird.fly();

	}

}
