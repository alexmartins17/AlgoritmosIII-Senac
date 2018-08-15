
public class Vetor {

	private String[] data;
	private int size;
	private int numElements;
	
	public Vetor(int size){
		this.size = size;
		this.data = new String[this.size];
		this.numElements = 0;
	}

	//Getters and Setters
	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNumElements() {
		return numElements;
	}

	public void setNumElements(int numElements) {
		this.numElements = numElements;
	}
	
	public void addFirst(String data){
		if(this.numElements == 0){
			this.data[0] = data;
			this.numElements++;
		}else{
			int i = 0;
			for(i = this.numElements; i > 0; i--){
				this.data[i] = this.data[i - 1];
			}
			this.data[i] = data;
			this.numElements++;
		}
		
	}
	
	public void insertIndex(String data, int index){
		this.data[index] = data;
		this.numElements++;
	}
	
	public void addLast(String data){
		this.data[this.numElements] = data;
		this.numElements++;
	}
	
	public void print(){
		for(int i = 0; i < this.data.length; i++){
			System.out.println(this.data[i]);
		}
	}
	
}
