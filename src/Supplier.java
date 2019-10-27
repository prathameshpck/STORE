package store;



import  store.Cart;
import store.Node;
import java.util.Scanner;


public class Supplier implements User 
{
	private static final int NULL = 0;
	String pass;
	
	Cart cart = new Cart();
	Orders orders = new Orders();
	
	
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
	public void defaults()
	{
			int ch=0;
			do
			{


				System.out.print("1. My Orders\n 2.Cart\n 3.List item for sale\n 4. Logout \n");

				Scanner sc = new Scanner(System.in);
				ch = sc.nextInt();
				switch(ch)
				{
					case 1: //this.ord.display();
							break;
				
					case 2: this.cart.display();
							break;
			
					case 3:
						System.out.println("Enter Item id :-");
						Scanner scanner = new Scanner(System.in);
						String id = scanner.nextLine();
						System.out.println("Enter Item Name:-");
						String name = scanner.nextLine();
						System.out.println("Enter item price");
						int price = scanner.nextInt();
						this.cart.addToCart(new Item(id,name,price,this.email), 6);
						break;
				}
			}while(ch!=4);
	}

	public void display()
	{
		System.out.println(this.email +"\t"+this.pass);
	}

}
