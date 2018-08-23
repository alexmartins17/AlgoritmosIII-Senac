
public class Pilha<T> {

	private Lista l;
	
	public Pilha(){
		this.l = new Lista();
	}
	public void push(T data){
		l.append(data);
	}
	
	public T pop(){
		if(this.isEmpty()){
			throw new RuntimeException("Empty Stack!");
		}else{
		T data = (T) l.getTail().getData();
		l.removeLast();
		return data;
		}
	}
	
	public T top(){
		if(this.isEmpty()){
			throw new RuntimeException("Empty Stack!");
		}else{
			return (T) l.getTail().getData();
		}
	}
	
	public boolean isEmpty(){
		return l.getHead() == null;
	}
}
