package aaa;
import java.util.Scanner;

class Fourwheeler{
	String name;
	int cc;
	int safety;
	int price;
	Fourwheeler(String n,int c,int sft,int p){
		this.name=n;
		this.cc=c;
		this.safety=sft;
		this.price=p;
	}
	void VehicleException() {
		System.out.println("Enter Available cc: ");
		Scanner s=new Scanner(System.in);
		int carcc=s.nextInt();
		if(carcc<1000||carcc>4000) {
			System.out.println("It is a two wheller,not four wheller");
		}
	}
	void display()  {
		System.out.println(name+" "+cc+" "+safety+" "+price);
	}
	void UnsafetyException() {
		System.out.println("Enter safety value: ");
		Scanner s=new Scanner(System.in);
		int sftvvl=s.nextInt();
		if(sftvvl!=5) {
			System.out.println("Sorry,Invalid safety features");
		}
		
	}
}



public class DemoFourwheeler {

	public static void main(String[] args) {
		Fourwheeler c1=new Fourwheeler("Honda Breeza",1300,5,1950000);
		c1.display();
		c1.VehicleException();
		c1.UnsafetyException();
		Fourwheeler c2=new Fourwheeler("Hyundai Creta",1600,5,2050000);
		c2.display();
		c2.VehicleException();
		c2.UnsafetyException();
		Fourwheeler c3=new Fourwheeler("Honda Jazz",1000,4,650000);
		c3.display();
		c3.VehicleException();
		c3.UnsafetyException();
		Fourwheeler c4=new Fourwheeler("KIA Seltos",1700,6,1000000);
		c4.display();
		c4.VehicleException();
		c4.UnsafetyException();

	}

}

