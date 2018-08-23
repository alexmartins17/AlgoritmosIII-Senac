import java.util.NoSuchElementException;

public class Fila<T> {

	private Node head;
	private Node tail;
	private int numElements;
	
	public Fila(){
		this.head = this.tail = null;
		this.numElements = 0;
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

	public int getNumElements() {
		return numElements;
	}
	
	//Métodos da classe
	public void push(T data){
		Node novo = new Node(data);
		if(this.head == null){
			this.tail = novo;
		}else{
			novo.setNext(this.head);
			this.head.setPrevious(novo);
		}
		this.head = novo;
		this.numElements++;
	}
	
	public T pop(){
		if(this.isEmpty() == true){
			throw new NoSuchElementException("Queue is empty.");
		}
		T elemento = (T) this.tail.getData();
		if(this.head == this.tail){
			this.head = this.tail = null;
		}else{
			this.tail = this.tail.getPrevious();
			this.tail.setNext(null);
		}
		this.numElements--;
		return elemento;
	}
	
	public T peek(){
		if(this.isEmpty()){
			throw new NoSuchElementException("Queue is empty.");
		}
		return (T) this.tail.getData();
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}

	public void inverter(){
		Pilha p = new Pilha();
		while(this.isEmpty() != true){
			p.push(this.pop());
		}
		
		while(p.isEmpty() != true){
			this.push((T) p.pop());
		}
		
	}
}
