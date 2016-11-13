
public class QualquerCoisa {
	int atributo1;
	float atributo2;
	int atributo3;
	int atributo4;
	int atributo5;

	public QualquerCoisa(int parametro, float parametro2, int parametro3) { // construtor
		atributo1 = parametro;
		atributo2 = parametro2;
		atributo3 = parametro3;
	}

	public QualquerCoisa(int parametro1) {
		atributo4 = parametro1;
	}

	public QualquerCoisa() {
		atributo5 = 4;
	}

	private void reset() { // metodo
		atributo1 = 2;
		atributo2 = 5;
		atributo3 = 6;
		atributo4 = 7;
		atributo5 = 8;
	}

	public float metodo2() {
		return atributo2;
	}

	public int metodo3(boolean para) {
		if (para) {
			return atributo3;

		}else{
			return atributo4; 
		}
	}
	public void metodo4(){
		this.reset(); // CHAMA O METODO RESET
		atributo1 = 4; 
		atributo2 = 2; 
	}
	public void metodo5(int a, float b, int c, int d , int e){
		atributo1 = a; 
		atributo2 = b; 
		atributo3 = c; 
		atributo4 = d; 
		atributo5 = e; 
	}
	
}
