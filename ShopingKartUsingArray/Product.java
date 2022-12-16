package shoppingKart_Project;

import java.util.Scanner;

public class Product {
	int id;
	String name,brand;
	double price;
	int quantity;
	
	
	
	public Product(int id, String name, String brand, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}


	public  Product AddProduct()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product id:");
		 id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter product name:");
		name=sc.nextLine();
		System.out.println("Enter product Brand:");
		 brand=sc.nextLine();
		System.out.println("Enter product Price:");
		price=sc.nextDouble();
		System.out.println("Enter product quantity:");
		 quantity=sc.nextInt();
		 sc.close();
		Product product=new Product(id, name, brand, price, quantity);
		return product;
	}
	
	
	public void displayAllProduct()
	{
		System.out.println("Product id: "+id+"\n product name: "+name+
				"\n product Brand: "+brand+"\n product Price: "+ price+"\n Product Quantity:"+ quantity);
	}
}