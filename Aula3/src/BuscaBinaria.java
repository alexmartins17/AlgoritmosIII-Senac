
public class BuscaBinaria {

	public int buscaBinariaIterativa(int[] array, int chave){
		int inicio = 0;
		int fim = array.length - 1;
		int meio = (inicio + fim) / 2;
		
		while(inicio < fim){
			if(chave == array[meio]){
				return meio;
			}else{
				if(chave > array[meio]){
					inicio = meio + 1;
					meio = (inicio + fim) / 2;
				}else{
					fim = meio - 1;
					meio = (inicio + fim) / 2;
				}
			}
		}
		return -1;
	}
	
	public int buscaBinariaRecursiva(int[] array, int chave){
		return this.buscaRecursiva(array, chave, 0, array.length - 1);
	}
	
	public int buscaRecursiva(int[] array, int chave, int inicio, int fim){
		int meio = (inicio + fim) / 2;
		if(inicio > fim){
			return -1;
		}
		if(chave == array[meio]){
			return meio;
		}
		if(chave > array[meio]){
			return this.buscaRecursiva(array, chave, inicio = meio + 1, fim); 
		}else{
			return this.buscaRecursiva(array, chave, inicio, fim = meio - 1);
		}
		
	}
}
