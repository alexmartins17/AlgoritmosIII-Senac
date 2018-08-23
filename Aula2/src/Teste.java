
public class Teste {

	public static void main(String[] args) {
		
		//TESTE LISTA ENCADEADA
		ListaEncadeada le = new ListaEncadeada();
		
		le.addFirst(2);
		le.append(4);
		
		Node aux = le.getHead();
		while(aux != null){
			if(aux.getData().equals(2) && aux.getNext().getData().equals(4)){
				le.insert(3, aux, aux.getNext());
				break;
			}
			aux = aux.getNext();
		}
		
		//le.removeFirst();
		//le.removeLast();
		
		/*aux = le.getHead();
		while(aux != null){
			if(aux.getData().equals(3)){
				le.remove(aux);
				break;
			}
			aux = aux.getNext();
		}*/
		
		
		aux = le.getHead();
		while(aux != null){
			System.out.println(aux.getData());
			aux = aux.getNext();
		}
		//FIM TESTE LISTA ENCADEADA
		
		//TESTE PILHA
		Pilha p = new Pilha();
		
		p.push(1);
		p.push(2);
		p.push(3);
		p.push(4);
		p.push(5);
		
		for(int i = 0; i < 5; i++){
			System.out.println("Desempilhei:" + p.pop());
		}
		//FIM TESTE PILHA
		
		//TESTE FILA
		Fila f = new Fila();
		
		f.push(1);
		f.push(2);
		f.push(3);
		f.push(4);
		f.push(5);
		
		f.inverter();
		
		for(int i = 0; i < 5; i++){
			System.out.println("Tirei da fila:" + f.pop());
		}
		//FIM TESTE FILA
	}

}
