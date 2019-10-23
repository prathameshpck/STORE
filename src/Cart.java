package javaapplication3;

public class Cart
{
    Node head;
    int number;

    public Cart()
    {
        this.head = null;
        this.number=0;
    }
    public void addToCart(Item item, int quantity)
    {
        Node temp = new Node(item,quantity);
        if(this.head == null)
        {
            head = temp;
        }
        else
        {
            head.prevNode = temp;
            temp.nextNode = head;
            head = temp;
        }
    }

    public void removeFromCart(String itemid)
    {
        Node temp = head;
        try {
            while (true) {
                if (temp.item.id == itemid) {

                    Node temp1 = temp.prevNode;
                    Node temp2 = temp.nextNode;
                    if(temp1 != null)
                        temp1.nextNode = temp2;
                    if(temp2 !=null)
                        temp2.prevNode = temp1;
                    //temp = null;
                    break;
                } else
                    temp = temp.nextNode;
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("Item doesn't Exist in your cart");

        }
    }

    public void display(){

        Node temp = head;
        try{
            while(true)
            {
                temp.item.display();
                temp=temp.nextNode;
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("End of cart");
        }
    }
    public void checkout()
    {
        Payment p = new Payment() {
        }

    }

}
