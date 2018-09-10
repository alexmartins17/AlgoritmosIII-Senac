
public class Kmp {

	
	public int[] montarTabela(String substring){
		int[] tab = new int[substring.length()];
		tab[0] = -1;
		tab[1] = 0;
		int p = 2;
		int c = 0;
		
		while(p < substring.length()){
			if(substring.charAt(p - 1) == substring.charAt(c)){
				c++;
				tab[p] = c;
				p++;
			}else{
				if(c > 0){
					c = tab[c];
				}else{
					tab[p] = 0;
					p++;
				}
			}
		}
		
		return tab;
	}
	
	public int busca(String string, String substring){
		int m = 0;
		int i = 0;
		int[] tab = this.montarTabela(substring);
		
		while(m + 1 < string.length()){
			if(substring.charAt(i) == string.charAt(i + m)){
				if(i == substring.length() - 1){
					return m;
				}
				i++;
			}else{
				if(tab[i] > -1){
					m += i - tab[i];
					i = tab[i];
				}else{
					m++;
					i = 0;
				}
			}	
		}
		return - 1;
	}
}
