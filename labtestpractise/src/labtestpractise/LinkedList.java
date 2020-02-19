package labtestpractise;

public class LinkedList {
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public LinkedList(Node head) {
		this.head = head;
	}
	public LinkedList() {
		head=null;
	}
	
	//dont include this in notes
	public boolean isFull() {
		//implementation ignored
		return false;
	}
	
	public void addToFront(int d) {
		
		if(isFull()) {
			System.out.println("List is full");
			return;
		}
		else {
			Node temp = new Node();
			temp.setData(d);
			temp.setNextNode(null);
			if(head == null) {
				head = temp;
			}
			else {
				temp.setNextNode(head);
				head = temp;
			}
			
		}
		
	}
	
	public void addToMiddle(int d) {
		if(isFull()) {
			System.out.println("List is full");
			return;
		}
		
		
		
		else {
			Node temp = new Node();
			temp.setData(d);
			if(head == null) {
				head = temp;
			}
			else {
				temp.setNextNode(head.getNextNode());
				head.setNextNode(temp);
			}
		}
	}
	
	public void addToBack(int d) {
		if(isFull()) {
			System.out.println("List is full");
		}
		else {
			Node temp = new Node();
			temp.setData(d);
			if(head==null) {
				head =temp;
			}
			else {
				Node curr = new Node();
				curr = head;

				while(curr.getNextNode()!=null) {
					curr = curr.getNextNode();
				}
				curr.setNextNode(temp);
			}
		}
	}
	
	
	
	
	public void deleteFromFront() {
		if(head ==null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = head;
			head = head.getNextNode();
			System.out.println("Data deleted from front: "+ temp.getData());
		}
	}
	
	public void deleteFromBack() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node curr = new Node();
			curr=head;
			while(curr.getNextNode().getNextNode()!=null) {
				curr=curr.getNextNode();
			}
			System.out.println("Value deleted from back: "+curr.getNextNode().getData());
			curr.setNextNode(null);
			
		}
	}
	
	public void deleteFromMiddle() {
		if(head==null) {
			System.out.println("List is empty");
		}
		else {
			Node temp = new Node();
			temp = head.getNextNode();
			System.out.println("Value deleted from middle: "+ head.getNextNode().getData());
			head.setNextNode(null);
			head.setNextNode(temp);
		}
	}
	
	public Node search(int i) {
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			Node temp = new Node();
			temp = head;
			while (temp!=null) {
				if(temp.getData() == i) {
					return temp;
				}
				temp = temp.getNextNode();
			}
		}
		return null;
	}
	
	public void display() {
		if(head==null) {
			System.out.println("The list is empty");
		}
		else {
			Node temp = new Node();
			temp = head;
			while(temp!=null) {
				System.out.println("Linked list value: "+temp.getData());
				temp = temp.getNextNode();
			}
		}
	}
	
}
