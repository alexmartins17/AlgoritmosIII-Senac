
public class Aresta {

	private int peso;
	private Vertice vertice1;
	private Vertice vertice2;
	
	public Aresta(int peso, Vertice vertice1, Vertice vertice2){
		this.peso = peso;
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;	
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public Vertice getVertice1() {
		return vertice1;
	}

	public void setVertice1(Vertice vertice1) {
		this.vertice1 = vertice1;
	}

	public Vertice getVertice2() {
		return vertice2;
	}

	public void setVertice2(Vertice vertice2) {
		this.vertice2 = vertice2;
	}
	
	
}
