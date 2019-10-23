
public class Supplier implements User 
{
	private static final int NULL = 0;
	String spass;
	
	//Inventory inv = new Inventory();
	
	String email;
	long number;
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
	Supplier(String e, String p, long n)
	{
		email = e;
		spass = p;
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
		spass=p;
		System.out.println("\n Entered password is: \n");
		for(int i=0; i<spass.length(); i++)
		System.out.print("*");
	
	}

}
