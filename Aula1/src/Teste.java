
public class Teste {

	public static void main(String[] args) {
		
		//Listas criadas para teste
		List l1 = new List(); // addFirst
		List l2 = new List(); // insertBefore
		List l3 = new List(); // insertAfter
		
		long inicio = System.currentTimeMillis();
		for(int i = 1; i <= 1000000; i++){
			l1.addFirst("Alex" + i);
		}
		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execução - addFirst, Lista:" + (fim - inicio));
		
		l2.addFirst("Alex" + 20000000);
		l2.addFirst("Alex" + 0);
		
		inicio = System.currentTimeMillis();
		for(int i = 1; i <= 100000; i++){
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
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução - insertBefore, Lista:" + (fim - inicio));
		
		
		l3.addFirst("João");
		l3.addFirst("Alex");
		l3.addFirst("Alex" + 20000000);
		l3.addFirst("Alex" + 0);
		
		inicio = System.currentTimeMillis();
		for(int i = 1; i <= 1000000; i++){
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
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução - insertAfter, Lista:" + (fim - inicio));
		
		//l1.print();
		//l2.print();
		//l3.print();
		
		Vetor v1 = new Vetor(100000);
		Vetor v2 = new Vetor(1000000);
		Vetor v3 = new Vetor(1000000);
		
		inicio = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++){
			v1.addFirst("Bruna" + i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução - addFirst, Vetor:" + (fim - inicio));
		
		inicio = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){
			v2.addLast("Bruno" + i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução - addLast, Vetor:" + (fim - inicio));
		
		inicio = System.currentTimeMillis();
		for(int i = 0; i < 1000000; i++){
			v3.insertIndex("Jonas" + i, i);
		}
		fim = System.currentTimeMillis();
		System.out.println("Tempo de execução - insertIndex, Lista:" + (fim - inicio));
		
		//v1.print();
		//v2.print();
		//v3.print();
	}

}
