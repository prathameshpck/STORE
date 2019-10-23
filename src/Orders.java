public class Orders {
	enum OrderStatus {
		Ordered, Dispatched, Shipped, Delivered;
	}
	String OrderName;
	String SellerDetail;
	String OrderTotal;
	String OrderAddress;
	String OrderDate;
	
	public Orders(String on, String sd, String ot, String oa, String od) {
		OrderName = on;
		SellerDetail = sd;
		OrderTotal = ot;
		OrderAddress = oa;
		OrderDate = od;
	}
	
	void display() {
		System.out.print("Order name: "+OrderName+"\nSeller: " + SellerDetail + "\nOrder total: "+OrderTotal+ "\nOrder Address =\n "+OrderAddress+"\nOrder Date:"+OrderDate);
	}
}

