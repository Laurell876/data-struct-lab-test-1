package labtestpractise;

public class Driver {

	public static void main(String[] args) {
		Node nodetest = new Node();
		LinkedList list = new LinkedList();
		
		list.addToFront(5);
		list.addToFront(2);
		list.addToMiddle(3);
		list.addToMiddle(7);
		list.addToBack(8);
		
		list.deleteFromFront();
		list.deleteFromBack();
		list.deleteFromMiddle();
		
		Node found = list.search(5);
		
		System.out.println("Value found: "+found.getData());
		list.display();
	}

}
