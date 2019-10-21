public class Item {

    String id;
    String name;
    int price;
    //int discount;

    public Item(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Item Name:-" + name+"\nPrice:-" + price+"\n");

    }


}
