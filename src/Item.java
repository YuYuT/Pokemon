
public class Item {

	private String nome;
	private String descricao;
	private int preco;

	public Item() {

	}

	public String getNome() { // GET -> Pega o dado do Set e retorna o valor

		return nome;
	}

	public void setNome(String nome) { // SET -> Deve dar valor para aparecer

		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

}
