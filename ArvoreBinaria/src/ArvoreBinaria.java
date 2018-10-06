
public class ArvoreBinaria {

	private Node root;

	public ArvoreBinaria() {
		this.root = null;
	}

	// Getters and Setters
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void inserir(int elemento) {

		if (this.root == null) {
			Node novo = new Node(elemento);
			this.root = novo;
		} else {
			this.root.inserirNo(elemento);
		}
	}

}
