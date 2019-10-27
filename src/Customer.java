package store;



import java.util.Scanner;
public class Customer implements User
{
		final int NULL = 0;
		String pass;
		String username;
		
		Cart cart = new Cart();
		Address add = new Address();
		//Orders ord = new Orders();
		
		void browse(Supplier array[])
		{
			for(int i = 0;i<array.length;i++)
			{
				try
				{
					array[i].cart.display();
				}
				catch(NullPointerException e)
				{
					i++;
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					break;
				}
			}
			System.out.println("Enter Item id of item you want to add to cart , followed by amount \n press q to exit");
			Scanner scanner = new Scanner(System.in);
			String a = scanner.nextLine();
			if(!a.equals("q"))
			{
				Item item=null;
				for (int i = 0; i <array.length ; i++)
				{
					Node temp = array[i].cart.head;
					if(temp.item.id.equals(a))
					{
						item = temp.item;
						break;
					}
					else
						temp=temp.nextNode;
				}
				int b = scanner.nextInt();
				this.cart.addToCart(item,b);
			}
			else
				this.defaults(array);
		}
		
		void defaults(Supplier a[])
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
			
			case 3: this.browse(a);

			case 4: return;

			default:
					System.out.println("Invalid option");;
			}
		}
		String email;
		Double number;
		/*Customer()
		{
			email = "no email";
			number = NULL;
		}
		
		Customer(long n)
		{
			number=n;
		}
		Customer(String e)
		{
			email=e;
		}*/
		Customer(String e, String p, Double n)
		{
			
			this.username = e;
			this.pass = p;
			this.number = n;
		}
		
		@Override
		public void adetails() 
		{
			System.out.println("The details provided are:" +email+ " and " +number);
			
		}	
		
		@Override
		public void ndetails() 
		{
			System.out.println("The detail provided is: "+number);
			
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
	
	}
