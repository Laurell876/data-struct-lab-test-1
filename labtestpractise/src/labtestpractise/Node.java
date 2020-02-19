package labtestpractise;

public class Node {
	private int data;
	private Node nextNode;
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node(int data, Node nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
	public Node() {
		data = 1;
		nextNode = null;
	}
	
	
}
