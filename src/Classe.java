
public class Classe {
	public final static int JANEIRO = 1; 
	public final static int FEVEREIRO = 2; 
	private static int atributo1;
	public int atributo2; // nao recomendado
	private String atributo3;
	private Pokemon pokemon;
	
	public Classe() { // construtor

	}

	public Classe(int parametro1) { // construtor

	}

	public Classe(int parametro2, String parametro) { // construtor

	}

	public void metodo1() { // letra minuscula tem void

	}

	private void metodo2() {

	}

	public int metodo3() { // retorna o valor tem int, pode ser string tambem
		return 10;
	}

	public String metodo4() {
		return atributo3;
	}

	public String metodo5() {
		return "haha";
	}

	public void metodo6() {
		int variavel1 = 10;
		String variavel2 = " ";
		float variavel3 = 1.4f;
		metodo9(variavel1, variavel3); 
	}

	public void metodo7() {
		char[] variavel1 = {};
		System.out.println(variavel1);
	}
	public void metodo8(){
		System.out.println(atributo1);
		metodo6(); 
		metodo2(); 
	}
	public void metodo9(int parametro1, float parametro3){ // parametro atributo e variavel guardam valores
		System.out.println(parametro1);
		System.out.println(parametro3);
	}
	public static void metodo10(){
		int var1 = atributo1; 
	}
}

