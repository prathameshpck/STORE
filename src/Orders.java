package store;


public class Orders {

    Node head;

    public Orders()
    {
        this.head =null;
    }

    public void add()
    {


    }
    void display()
    {
        System.out.print("Order name: "+OrderName+"\nSeller: " + SellerDetail + "\nOrder total: "+OrderTotal+ "\nOrder Address =\n "+OrderAddress+"\nOrder Date:"+OrderDate);
    }
}
