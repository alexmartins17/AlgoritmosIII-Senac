
public class Grafo {

	private int nVertices;
	private int nArestas;
	
	private Vertice[] conjV;
	private Aresta[] conjA;
	private int i;
	
	public Grafo(int vertices, int arestas){
		this.nVertices = vertices;
		this.nArestas = arestas;
		this.conjV = new Vertice[this.nVertices];
		this.conjA = new Aresta[this.nArestas];
		this.i = 0;
	}
	
	public void inserir(int id1, String dado1, int id2, String dado2, int peso){
		if(this.conjV[id1 - 1] == null){
			Vertice novo = new Vertice(id1, dado1);
			this.conjV[id1 - 1] = novo;
		}
		
		if(this.conjV[id2 - 1] == null){
			Vertice novo = new Vertice(id2, dado2);
			this.conjV[id2 - 1] = novo;
		}
		Aresta novo = new Aresta(peso, conjV[id1 - 1], conjV[id2 - 1]);
		conjA[this.i] = novo;
		this.i++;
	}
	
	public void arvoreGMinima(){
		Vertice[] subset = new Vertice[this.nVertices];
		Aresta aux;
		for(int i = 0; i < this.conjA.length; i++){
			for(int j = 0; j < this.conjA.length - 1; j++){
				if(this.conjA[j].getPeso() > this.conjA[j + 1].getPeso()){
					aux = this.conjA[j];
					this.conjA[j] = this.conjA[j + 1];
					this.conjA[j + 1] = aux;
				}
			}
		}
		
		for(int i = 0; i < this.conjA.length; i++){
			
			Vertice v1 = this.busca(subset, this.conjA[i].getVertice1());
			Vertice v2 = this.busca(subset, this.conjA[i].getVertice2());
			
			if(v1.getId() != v2.getId()){
				this.unir(subset, v1, v2);
				
				System.out.println("Vertice " + this.conjA[i].getVertice1().getDado() + " ligado ao vertice " +
						this.conjA[i].getVertice2().getDado() + " com peso de " + this.conjA[i].getPeso());
			}
			
		}
	}
	
	public Vertice busca(Vertice[] subset, Vertice v){
		if(subset[v.getId() - 1] == null){
			return v;
		}else{
			return this.busca(subset, subset[v.getId() - 1]);
		}
	}
	
	public void unir(Vertice[] subset, Vertice v1, Vertice v2){
		Vertice v1set = this.busca(subset, v1);
		Vertice v2set = this.busca(subset, v2);
		subset[v1set.getId() - 1] = v2set;
	}
}
