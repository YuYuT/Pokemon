
public class MainTeste {
	public static void main(String[] args) {
		QualquerCoisa bola = new QualquerCoisa(); // OBJETO CRIADO
		float variavel1 = bola.metodo2();
		int variavel = bola.metodo3(true);

		QualquerCoisa arco = new QualquerCoisa();
		arco.metodo4(); 
		arco.metodo5(7, 5, 4, 1, 8);
		
		QualquerCoisa lapis = new QualquerCoisa();
		int variavel3 = lapis.metodo3(false); 									
		lapis.metodo5(17,6,47,95,23);
	}
}
