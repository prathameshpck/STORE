public class Node {

    Node nextNode;
    Node prevNode;
    Item item;
    int quantity;

    public Node(Item value,int quantity)
    {
        this.item = value;
        this.quantity = quantity;
        this.nextNode = null;
        this.prevNode = null;
    }


}
