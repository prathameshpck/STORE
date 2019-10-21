public class Node {

    Node nextNode;
    Node prevNode;
    Item item;

    public Node(Item value)
    {
        this.item = value;
        this.nextNode = null;
        this.prevNode = null;
    }


}
