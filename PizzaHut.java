package aaa;
import  java.util.*;
class Pizza
{
	String pizzabase;
	int price;
	Pizza(String base, int q)
	{
		pizzabase = base;
		price = q;
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price );
	}
	
}
class ChickenPizza extends Pizza
{
	String topping = "chicken";
	ChickenPizza(String base, int q)
	{
		super(base, q);
		
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price +"\nTopping ="+topping);
	}
	
}
class MuttonPizza extends ChickenPizza
{
	String flavouredtopping  = "Mutton";
	MuttonPizza(String base, int q)
	{
		super(base, q);
		
	}
	void display()
	{
		System.out.println("PizzaBase = "+pizzabase+"\nPrice = "+price+"\nFlavoured Topping = "+flavouredtopping );
	}
}

public class PizzaHut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pizza pz1 = new Pizza("Thin", 125);
		ChickenPizza cp1 = new ChickenPizza("Thick", 240);
		MuttonPizza Mp1 = new MuttonPizza("flat", 350);
		
		System.out.print("Veg Pizza Price = "+ pz1.price);
		System.out.print("Chicken Pizza Price = "+ cp1.price);
		System.out.print("Mutton Pizza Price = "+ Mp1.price);
		System.out.print("Choose your pizza\nPress\n 1 ---> Veg Pizza \n2 ---> Chicken Pizza\n3 ---> Mutton Pizza");
		int a = sc.nextInt();
		if(a== 1)
		{
			pz1.display();
		}else if(a== 2)
		{
			cp1.display();
			
		}
		else if(a== 3)
		{
			Mp1.display();
		}
		else
		{
			System.out.println("Enter valid number");
		}
	}

}

