import java.text.Normalizer;
public class Palindromo {

	private String eliminaEspacos(String s){
		s = s.replace(" ", "");
		return s;
	}
	
	private String eliminaAcentuacao(String s){
		s = Normalizer.normalize(s, Normalizer.Form.NFD);
		s = s.replaceAll("[^\\p{ASCII}]", "");
		
		return s;
	}
	
	private String inverteString(String s){
		String aux = "";
		for(int i = s.length() - 1; i >= 0; i--){
			aux += s.charAt(i);
		} 
		return aux;
	}
	public void verificaPalindromo(String s){
		s = this.eliminaEspacos(s);
		s = this.eliminaAcentuacao(s);
		if(s.equalsIgnoreCase(this.inverteString(s))){
			System.out.println("É palíndromo!");
		}else{
			System.out.println("Não é palíndromo!");
		}
	}
}
