import store.Item;

public class OrderNode extends store.Node
{
    String customer;

    enum OrderStatus
    {
        Ordered, Dispatched, Shipped, Delivered;
    }
    OrderStatus status = OrderStatus.Ordered;
    public OrderNode(Item value, int quantity,String customer) {
        super(value, quantity);
        this.customer = customer;
    }
}
