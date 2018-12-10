
public class Teste {

	public static void main(String[] args) {
		
		Grafo g = new Grafo(12, 21);
		
		g.inserir(1, "UM", 2, "DOIS", 8);
		g.inserir(2, "DOIS", 3, "TRÊS", 7);
		g.inserir(1, "UM", 5, "CINCO", 7);
		g.inserir(2, "DOIS", 5, "CINCO", 7);
		g.inserir(3, "TRÊS", 5, "CINCO", 7);
		g.inserir(3, "TRÊS", 6, "SEIS", 7);
		g.inserir(4, "QUATRO", 5, "CINCO", 6);
		g.inserir(5, "CINCO", 6, "SEIS", 3);
		g.inserir(4, "QUATRO", 7, "SETE", 9);
		g.inserir(4, "QUATRO", 8, "OITO", 9);
		g.inserir(5, "CINCO", 8, "OITO", 8);
		g.inserir(5, "CINCO", 9, "NOVE", 5);
		g.inserir(6, "SEIS", 9, "NOVE", 4);
		g.inserir(7, "SETE", 8, "OITO", 7);
		g.inserir(7, "SETE", 10, "DEZ", 8);
		g.inserir(8, "OITO", 10, "DEZ", 5);
		g.inserir(8, "OITO", 11, "ONZE", 4);
		g.inserir(9, "NOVE", 11, "ONZE", 1);
		g.inserir(9, "NOVE", 12, "DOZE", 2);
		g.inserir(10, "DEZ", 11, "ONZE", 3);
		g.inserir(11, "ONZE", 12, "DOZE", 2);
		
		g.arvoreGMinima();
	}
}
