
public class Sort {

	public void bubbleSort(int array[]){
		int aux = 0;
		for(int i = 0; i < array.length - 1; i++){
			for(int j = i; j < array.length - 1; j++){
				if(array[j] > array[j + 1]){
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}
	
}
