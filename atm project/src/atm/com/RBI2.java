package atm.com;

import java.util.Scanner;

class Atm
{
	int pin = 1234;
	int p;
	
	
	
	void acceptInput() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the pin");
		p =scan.nextInt();
	}
	
	void verify()
	{
		if(pin==p)
		{
			System.out.println("Collect your money");
		}
		else
		{
			System.out.println("Invalid pin number");
		}
	}
}




class Bank
{
	void init()
	{
		Atm a = new Atm();
		a.acceptInput();
		a.verify();
	}
	
}












public class RBI2 {

	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.init();
		
	}

}
