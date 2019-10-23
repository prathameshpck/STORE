package javaapplication3;


import java.util.Scanner;


public class Supplier implements User 
{
	private static final int NULL = 0;
	String pass;
	
	Cart cart = new Cart();
        Orders ord = new Orders();
	
	
	String email;
	double number;
	Supplier()
	{
		email = "no email";
		number = NULL;
	}
	
	
	Supplier(long n)
	{
		number=n;
	}
	Supplier(String e)
	{
		email=e;
	}
	Supplier(String e, String p, double n)
	{
		email = e;
		pass = p;
		number = n;
	}
	
	@Override
	public void adetails() 
	{
		System.out.println("The details provided are:" +email+ " and " +number);
		
	}	
	
	@Override
	public void ndetails() 
	{
		System.out.println("The detail provoided is: "+number);
		
	}
	
	@Override
	public void edetails() 
	{
		System.out.println("The detail provoided is: "+email);
		
	}

	@Override
	public void passwords(String p) 
	{
		pass=p;
		System.out.println("\n Entered password is: \n");
		for(int i=0; i<pass.length(); i++)
		System.out.print("*");
	
	}
        void defaults()
		{
			System.out.print("1. My Orders\n 2.Cart\n 3.Browse\n");
			int ch=0;
			Scanner sc = new Scanner(System.in);
			ch = sc.nextInt();
			switch(ch)
			{
			case 1: //this.ord.display();
					break;
				
			case 2: this.cart.display();
					break;
			
			case 3: this.cart.addToCart(new Item("a","b",9,"c"), 6);
			}
		}

}
