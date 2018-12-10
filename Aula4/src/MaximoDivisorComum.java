
public class MaximoDivisorComum {
	
	
	public int calculaMDC(int p, int q){
		int result = p % q;
		if(result == 0){
			return q;
		}else{
			System.out.println(result);
			return this.calculaMDC(q, result);
		}
	}
}
