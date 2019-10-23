public class Address {
	String Name;
	String HouseNo;
	String Street;
	String Area;
	String Landmark;
	String city;
	int pin;
	int Phone;
	
	public Address(String n,String h,String st, String A, String L, String c, int p, int ph) {
		Name = n;
		HouseNo = h;
		Street = st;
		Area = A;
		Landmark = L;
		city = c;
		pin = p;
		Phone = ph;
	}
	void dispplay() {
		System.out.print("Name: "+ Name+ "House No:"+HouseNo+" "+Street+" "+Area+" Landmark:"+Landmark+ " City: "+city+"\n"+ pin+"\n"+ Phone+"\n");
	}
}
