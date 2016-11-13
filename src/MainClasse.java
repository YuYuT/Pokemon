
public class MainClasse {
	public static void main(String[] args) {
		Classe objeto = new Classe();
		int var1 = objeto.atributo2;
		int var2 = objeto.JANEIRO;
		int var3 = Classe.JANEIRO;
		Classe.metodo10();
		Classe objeto2 = new Classe(10, "goku"); // igual o da CLASSE os
													// parametros
		objeto2.metodo1();
		int var4 = objeto.metodo3();
		objeto2.metodo9(10, 5.46f);
		Pokemon squirtle = new Pokemon();
		Item pokebola = new Item(); 
		pokebola.setNome("pokebola");
	}
}
