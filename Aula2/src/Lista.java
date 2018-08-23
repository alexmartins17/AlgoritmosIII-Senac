
public class Lista<T> {

	private Node head;
	private Node tail;
	private int size;
	
	public Lista(){
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
	
	//Métodos da Classe
	public void addFirst(T data){
		Node novo = new Node(data);
		if(this.head == null){
			this.tail = novo;
		}else{
			novo.setNext(this.head);
			this.head.setPrevious(novo);
		}
		this.head = novo;
		this.size++;
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
		this.size++;
	}
	
	public void removeFirst(){
		if(this.head == this.tail){
			this.head = this.tail = null;
		}else{
			this.head = this.head.getNext();
			this.head.setPrevious(null);
		}
		this.size--;
	}
	
	public void removeLast(){
		if(this.head == this.tail){
			this.head = this.tail = null;
		}else{
			this.tail = this.tail.getPrevious();
			this.tail.setNext(null);
		}
		this.size--;
	}
	
	public int size(){
		return this.size;
	}
	
	public T get(int index){
		Node aux = this.head;
		for(int i = 0; i <= index; i++){
			aux = aux.getNext();
		}
		return (T) aux.getData();
	}
}
