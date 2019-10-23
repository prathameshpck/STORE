public class Customer implements User
{
		final int NULL = 0;
		String pass;
		String username;
		
		//Cart cart = new Cart();
		//Address add = new Address();
		//Payment pay = new Payment();
		
		String email;
		long number;
		Customer()
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
		}
		Customer(String e, String p, long n)
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
