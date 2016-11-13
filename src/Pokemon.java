import java.util.List;

public class Pokemon {
	private String nome;
	private int nivel;
	private double vida;
	private String tipo;
	private List<String> golpes;

	public Pokemon() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<String> getGolpes() {
		return golpes;
	}

	public void setGolpes(List<String> golpes) {
		this.golpes = golpes;
	}

	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}
	

}
