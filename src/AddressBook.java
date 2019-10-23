

public class AddressBook {
	ANode head;
	public AddressBook() {
		this.head.prevNode = null;
		this.head.nextNode = null;
	}
	
	public void Add(Address a) {
		ANode temp = new ANode(a);
		if(this.head == null) {
			head = temp;
		}
		else {
			head.prevNode = temp;
			temp.nextNode = head;
			head =temp;
		}
	}
	public void Remove(String names) {
		ANode temp = head;
		try {
			while(true) {
				if(temp.address.Name == names) {
					ANode temp1 = temp.prevNode;
					ANode temp2 = temp.nextNode;
					if(temp1 != null)
						temp1.nextNode = temp2;
					if(temp2 != null)
						temp.nextNode = temp1;
					break;
				}
				else 
					temp = temp.nextNode;
			}
		} catch(NullPointerException e) {
			System.out.print("Adresss is not there.");
		}
		
	}
	public void display() {
		ANode temp = head;
		try {
			while(true) {
				temp.address.dispplay();
				temp = temp.nextNode;
			}
		}catch(NullPointerException e) {
			System.out.print("End of Address");
		}
	}
}
