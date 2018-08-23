
public class Node <T>{

	private T data;
	private Node previous;
	private Node next;
	
	public Node(T data){
		this.data = data;
		this.previous = null;
		this.next = null;
	}

	//Getters and Setters
	public Node getPrevious() {
		return previous;
	}

	public void setPrevious(Node previous) {
		this.previous = previous;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public T getData() {
		return data;
	}
	
	
}
