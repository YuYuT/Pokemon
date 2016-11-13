import java.util.List;

public class Personagem {
	private String nome;
	private String genero;
	private int carteira;
	private List<String> pokemons;
	private List<String> itens;

	public Personagem() {
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public int getCarteira() {
		return carteira;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}

	public List<String> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List<String> pokemons) {
		this.pokemons = pokemons;
	}

	public List<String> getItens() {
		return itens;
	}

	public void setItens(List<String> itens) {
		this.itens = itens;
	}

}
