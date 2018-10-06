
public class Node {

	private int elemento;
	private Node esq;
	private Node dir;

	public Node(int elemento) {
		this.elemento = elemento;
		this.esq = this.dir = null;
	}

	// Getters and Setters
	public Node getEsq() {
		return esq;
	}

	public void setEsq(Node esq) {
		this.esq = esq;
	}

	public Node getDir() {
		return dir;
	}

	public void setDir(Node dir) {
		this.dir = dir;
	}

	public int getElemento() {
		return elemento;
	}

	public void inserirNo(int elemento) {
		if (elemento <= this.getElemento()) {
			if (this.getEsq() == null) {
				Node novo = new Node(elemento);
				this.setEsq(novo);
			} else {
				this.esq.inserirNo(elemento);
			}
		}
		if (elemento > this.getElemento()) {
			if (this.getDir() == null) {
				Node novo = new Node(elemento);
				this.setDir(novo);
			} else {
				this.dir.inserirNo(elemento);
			}
		}
	}

}
