
public abstract class BuscaLinear<T> implements Comparable<T> {

	public int buscaEquals(String[] array, String chave){
		int indice = 0;
		for(int i = 0; i < array.length; i++){
			if(chave.equals(array[i])){
				return i;
			}
		}
		return -1;
	}
	
	public int buscaComparable(T[] array, Comparable<T> chave){
		int indice = 0;
		for(int i = 0; i < array.length; i++){
			if(chave.compareTo(array[i]) == 0){
				return i;
			}
		}
		return -1;
	}
}
