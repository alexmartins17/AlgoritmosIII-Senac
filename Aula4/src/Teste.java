import java.text.Normalizer;

public class Teste {

	public static void main(String[] args) {
		
		//String s = "·‡ÈÌÛ˙‚„ÙıÍ";
		
		//System.out.println(s);
		
		//s = Normalizer.normalize(s, Normalizer.Form.NFD);
	    //s = s.replaceAll("[^\\p{ASCII}]", "");
		
	    //System.out.println(s);
		
		//String s = "hello world !!  .. ()";
		
		//System.out.println(s);
		
		//s = s.replace(" ", "");
		
		//System.out.println(s);
		
		Palindromo p = new Palindromo();
		
		p.verificaPalindromo("¡ mala n‡da n„ l‡ma");

		MaximoDivisorComum mdc = new MaximoDivisorComum();
	
		System.out.println(mdc.calculaMDC(70, 24));
	}

}
