public class ANode {
	ANode prevNode;
	ANode nextNode;
	Address address;
	
	public ANode(Address a) {
		this.address = a;
		this.prevNode =null;
		this.nextNode = null;
	}
}
