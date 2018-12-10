
public class TorreHanoi {

	private int[] t1;
	private int[] t2;
	private int[] t3;
	
	public TorreHanoi(int numPecas){
		this.t1 = new int[numPecas];
		this.t2 = new int[numPecas];
		this.t3 = new int[numPecas];
		
		this.montaTorre1(numPecas);
	}

	private void montaTorre1(int numPecas) {
		for(int i = 0; i > this.t1.length; i++){
			this.t1[i] = numPecas;
			numPecas--;
		}
	}
	
	public void solucionar(){
		
	}
}
