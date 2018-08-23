import java.util.NoSuchElementException;

public class BufferCircular<T> {
	
	private String[] dados;
	private int head;
	private int tail;
	
	public BufferCircular(){
		this.dados = new String[5];
		this.head = 0;
		this.tail = 0;
	}
	
	public int next(int aux){
		return (aux + 1) % this.dados.length;
	}
	
	public boolean isEmpty(){
		return this.head == this.tail;
	}
	
	public boolean isFull(){
		return this.next(this.tail) == this.head;
	}
	
	public void push(String valor){
		if(this.isFull()){
			throw new RuntimeException ("Queue is full");
		}
		this.dados[this.tail] = valor;
		this.tail = this.next(this.tail);
	}

	public String pop(){
		if(this.isEmpty()){
			throw new NoSuchElementException("Queue is empty.");
		}else{
			String elemento = this.dados[this.head];
			this.head = this.next(this.head);
			return elemento;
	
		}
	}
	
	public String peek(){
		if(this.isEmpty()){
			return null;
		}
			return this.dados[this.head];
	}
}
