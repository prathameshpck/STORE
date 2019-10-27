package store;

import store.Node;

public class Cart
{
    Node head;
    int number;

    public Cart() {
        this.head = null;
        this.number = 0;
    }

    public void addToCart(Item item, int quantity) {
        Node temp = new Node(item, quantity);
        if (this.head == null) {
            head = temp;
        } else {
            head.prevNode = temp;
            temp.nextNode = head;
            head = temp;
        }
        this.number++;
    }

    public void removeFromCart(String itemid) {
        Node temp = head;
        try {
            while (true) {
                if (temp.item.id.equals(itemid))
                {

                    Node temp1 = temp.prevNode;
                    Node temp2 = temp.nextNode;
                    if (temp1 != null)
                        temp1.nextNode = temp2;
                    if (temp2 != null)
                        temp2.prevNode = temp1;
                    //temp = null;
                    this.number--;
                    break;
                } else
                    temp = temp.nextNode;
            }
        } catch (NullPointerException e) {
            System.out.println("Item doesn't Exist in your cart");

        }
    }

    public void display() {

        Node temp = head;
        try {
            while (true) {
                temp.item.display();
                temp = temp.nextNode;
            }
        } catch (NullPointerException e) {
            System.out.println("End of cart");
        }

        System.out.println("1)Remove item from cart \t 2)Checkout ");
    }

    public void checkout(Supplier suppliers[])
    {
        Node temp = this.head;
        try{
            while(true)
            {
                try
                {

                    for(int i = 0;i<suppliers.length;i++)
                    {
                        if(temp.item.seller.equals(suppliers[i].email))
                            suppliers[i].orders.add(temp,);
                    }
                }
                catch (NullPointerException e)
                {
                    break;
                }
                temp=temp.nextNode;
            }
        }
        catch (NullPointerException e)
        {
            System.out.println(aof);
        }
    }
}

