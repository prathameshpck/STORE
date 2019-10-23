package store;

public class Item {

    String id;
    String name;
    int price;
    String seller;
    //int discount;

    public Item(String id, String name, int price,String seller) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.seller =seller;
    }

    public void display()
    {
        System.out.println("Item Name:-" + name+"\nPrice:-" + price+"\n");

    }


}
