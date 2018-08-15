
public class Teste {

	public static void main(String[] args) {
		
		/*List l1 = new List();
		List l2 = new List();
		List l3 = new List();
		
		for(int i = 1; i <= 100; i++){
			l1.addFirst("Alex" + i);
		}

		l2.addFirst("Alex" + 20000000);
		l2.addFirst("Alex" + 0);
		
		for(int i = 1; i <= 100; i++){
			Node aux = new Node("");
			aux = l2.getHead();
			while(true != false){
				if(aux.getData() == "Alex20000000"){
					l2.insertBefore("Alex" + i, aux);
					break;
				}
				aux = aux.getNext();
			}
		}
		
		l3.addFirst("João");
		l3.addFirst("Alex");
		l3.addFirst("Alex" + 20000000);
		l3.addFirst("Alex" + 0);
		
		for(int i = 1; i <= 100; i++){
			Node aux = new Node("");
			aux = l3.getHead();
			while(true != false){
				if(aux.getData() == "Alex20000000"){
					l3.insertAfter("Alex" + i, aux);
					break;
				}
				aux = aux.getNext();
			}
		}
		
		l1.print();
		l2.print();
		l3.print();
		*/
		Vetor v1 = new Vetor(100);
		Vetor v2 = new Vetor(100);
		Vetor v3 = new Vetor(100);
		
		for(int i = 0; i < 100; i++){
			v1.addFirst("Bruna" + i);
		}
		
		for(int i = 0; i < 100; i++){
			v2.addLast("Bruno" + i);
		}
		
		for(int i = 0; i < 100; i++){
			v3.insertIndex("Jonas" + i, i);
		}
		
		
		v1.print();
		v2.print();
		v3.print();
	}

}
