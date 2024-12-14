package atm.com;

import java.util.Scanner;

class InvalidInputException extends Exception
{
	
}

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
	
	void verify() throws Exception
	{
		if(pin==p)
		{
			System.out.println("Collect your money");
		}
		else
		{
			System.out.println("Invalid pin number");
			InvalidInputException iie = new InvalidInputException();
			throw iie;
		}
	}
}
class Bank
{
	void init()
	{
		Atm a = new Atm();
		try
		{
			a.acceptInput();
			a.verify();
		}
		catch(Exception e)
		{
			try
			{
				a.acceptInput();
				a.verify();
			}
			catch(Exception f)
			{
				try
				{
					a.acceptInput();
					a.verify();
				}
				catch(Exception g)
				{
					System.out.println("Card is blocked, Please contact to bank");
				}
			}
		}
	}
}


public class RBI {

	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.init();
	}
}
