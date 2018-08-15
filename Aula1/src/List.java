
public class List {

	private Node head;
	private Node tail;
	
	public List(){
		this.head = null;
		this.tail = null;
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
	
	public void addFirst(String data){
		Node novo = new Node(data);
		if(this.head == null){
			this.tail = novo;
		}else{
			novo.setNext(this.head);
			this.head.setPrevious(novo);
		}
		this.head = novo;
	}
	
	public void insertBefore(String data, Node aux){
		Node novo = new Node(data);
		
		novo.setNext(aux);
		novo.setPrevious(aux.getPrevious());
		aux.getPrevious().setNext(novo);
		aux.setPrevious(novo);
	}
	
	public void insertAfter(String data, Node aux){
		Node novo = new Node(data);
		
		novo.setPrevious(aux);
		novo.setNext(aux.getNext());
		aux.getNext().setPrevious(novo);
		aux.setNext(novo);
	}
	
	public void print(){
		Node aux = new Node("");
		aux = this.head;
		while(aux != null){
			System.out.println(aux.getData());
			aux = aux.getNext();
		}
	}
	
	
}
