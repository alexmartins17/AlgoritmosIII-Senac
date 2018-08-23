
public class ListaEncadeada<T> {

	private Node head;
	private Node tail;
	
	public ListaEncadeada(){
		this.head = this.tail = null;
	}

	//Getters and Setters
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	public void addFirst(T data){
		Node novo = new Node(data);
		if(this.head == null){
			this.tail = novo;
		}else{
			novo.setNext(this.head);
			this.head.setPrevious(novo);
		}
		this.head = novo;
	}
	
	public void append(T data){
		Node novo = new Node(data);
		if(this.tail == null){
			this.head = novo;
		}else{
			novo.setPrevious(this.tail);
			this.tail.setNext(novo);
		}
		this.tail = novo;
	}
	
	public void insert(T data, Node before, Node after){
		Node novo = new Node(data);
		novo.setNext(after);
		novo.setPrevious(before);
		before.setNext(novo);
		after.setPrevious(novo);
	}
	
	public void removeFirst(){
		if(this.head == this.tail){
			this.head = this.tail = null;
		}else{
			this.head = this.head.getNext();
			this.head.setPrevious(null);
		}
	}
	
	public void removeLast(){
		if(this.head == this.tail){
			this.head = this.tail = null;
		}else{
			this.tail = this.tail.getPrevious();
			this.tail.setNext(null);
		}
	}
	
	public void remove(Node aux){
		aux.getNext().setPrevious(aux.getPrevious());
		aux.getPrevious().setNext(aux.getNext());
	}
	
}
