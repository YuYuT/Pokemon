import java.util.ArrayList;
import java.util.List;

/** EXERCICIO **/
// Crie 3 itens, 6 pokemons e 4 golpes de pokemons logo abaixo. Faça a mesma
// coisa que fiz acima.
// Criei um novo objeto, dei valores para esse objeto, recuperei valores desse
// objeto e imprimi esses valores na tela.

public class Main {

	public static void main(String[] args) {

		Pokemon pikachu = new Pokemon();
		pikachu.setNome("Pikachu");
		pikachu.setNivel(5);
		pikachu.setTipo("Elétrico");
		pikachu.setVida(100);

		Golpe raio = new Golpe();
		raio.setDano(30);
		raio.setNome("raio");
		raio.setQuantidade(5);

		Pokemon charmander = new Pokemon(); // 1
		charmander.setNome("charmander");// 2
		charmander.setNivel(8);
		charmander.setTipo("Fogo");
		charmander.setVida(800);

		String nomePokemon = charmander.getNome(); // 3
		String tipoPokemon = charmander.getTipo();
		int nivelPokemon = charmander.getNivel();
		int vidaDoPokemon = (int) charmander.getVida();
		System.out.println(nomePokemon + "\n"); // 4
		System.out.println(nivelPokemon + "\n");
		System.out.println(tipoPokemon + "\n");
		System.out.println(vidaDoPokemon + "\n");

		Golpe fogo = new Golpe();
		fogo.setDano(50);
		fogo.setNome("fogo");
		fogo.setQuantidade(3);

		Pokemon squirtle = new Pokemon();
		squirtle.setNome("squirtle");
		squirtle.setNivel(9);
		squirtle.setTipo("Agua");
		squirtle.setVida(400);
		String nomeDoPokemon = squirtle.getNome();
		int nivelDoPokemon = squirtle.getNivel();
		String tipoDoPokemon = squirtle.getTipo();
		int vidaPokemon = (int) squirtle.getVida();
		System.out.println(nomeDoPokemon + "\n");
		System.out.println(nivelDoPokemon + "\n");
		System.out.println(tipoDoPokemon + "\n");
		System.out.println(vidaPokemon + "\n");
		Golpe agua = new Golpe();
		agua.setDano(60);
		agua.setNome("agua");
		agua.setQuantidade(5);
		String nomeAgua = agua.getNome();
		int danoAgua = (int) agua.getDano();
		int quantidadeAgua = agua.getQuantidade();
		System.out.println("Nome do Golpe: " + nomeAgua + "\n");
		System.out.println("O dano é de: " + danoAgua + "\n");
		System.out.println("Quantidades de danos: " + quantidadeAgua + "\n");
		
		Pokemon Cucruel = new Pokemon();
		Cucruel.setNome("Cucruel");
		Cucruel.setNivel(100);
		Cucruel.setTipo("Agua");
		Cucruel.setVida(5000);
		String nomeCucruel = Cucruel.getNome();
		int nivelDoCucruel = Cucruel.getNivel();
		String tipoDoCucruel = Cucruel.getTipo();
		int vidaCucruel = (int) Cucruel.getVida();
		System.out.println(nomeCucruel + "\n");
		System.out.println(nivelDoCucruel + "\n");
		System.out.println(tipoDoCucruel + "\n");
		System.out.println(vidaCucruel + "\n");
		Golpe agua1 = new Golpe();
		agua1.setDano(300);
		agua1.setNome("AGUAAAAAA");
		agua1.setQuantidade(34);
		String nomeAgua1 = agua1.getNome();
		int danoAgua1 = (int) agua1.getDano();
		int quantidadeAgua1 = agua1.getQuantidade();
		System.out.println("Nome do Golpe: " + nomeAgua1 + "\n");
		System.out.println("O dano é de: " + danoAgua1 + "\n");
		System.out.println("Quantidades de danos: " + quantidadeAgua1 + "\n");
		
		Pokemon latias = new Pokemon();
		latias.setNome("latias");
		latias.setNivel(80);
		latias.setTipo("magicaaaa");
		latias.setVida(500);
		String nomeLatias = latias.getNome();
		int nivelLatias = latias.getNivel();
		String tipoLatias = latias.getTipo();
		int vidaLatias = (int) latias.getVida();
		System.out.println(nomeLatias + "\n");
		System.out.println(nivelLatias + "\n");
		System.out.println(tipoLatias + "\n");
		System.out.println(vidaLatias + "\n");
		Golpe magica = new Golpe();
		magica.setDano(30);
		magica.setNome("magicaaaaaaa");
		magica.setQuantidade(54);
		String nomeMagica = magica.getNome();
		int danoMagica = (int) magica.getDano();
		int quantidadeMagica = magica.getQuantidade();
		System.out.println("Nome do Golpe: " + nomeMagica + "\n");
		System.out.println("O dano é de: " + danoMagica + "\n");
		System.out.println("Quantidades de danos: " + quantidadeMagica + "\n");
		
		Pokemon mew = new Pokemon();
		mew.setNome("mew");
		mew.setNivel(105);
		mew.setTipo("fofinhaaaa");
		mew.setVida(600);
		String nomeMew = mew.getNome();
		int nivelMew = mew.getNivel();
		String tipoMew = mew.getTipo();
		int vidaMew = (int) mew.getVida();
		System.out.println(nomeMew + "\n");
		System.out.println(nivelMew + "\n");
		System.out.println(tipoMew + "\n");
		System.out.println(vidaMew + "\n");
		Golpe fofura = new Golpe();
		fofura.setDano(400);
		fofura.setNome("Fofuraaa");
		fofura.setQuantidade(46);
		String nomeFofura = fofura.getNome();
		int danoFofura = (int) fofura.getDano();
		int quantidadeFofura = fofura.getQuantidade();
		System.out.println("Nome do Golpe: " + nomeFofura + "\n");
		System.out.println("O dano é de: " + danoFofura + "\n");
		System.out.println("Quantidades de danos: " + quantidadeFofura + "\n");

		Item pokebola = new Item();
		pokebola.setDescricao("Pegar um pokemon");
		pokebola.setNome("Pokebola");
		pokebola.setPreco(200);

		Item pocao = new Item();
		pocao.setDescricao("aumentar a vida do pokemon");
		pocao.setNome("Pocao");
		pocao.setPreco(100);

		Item mapa = new Item();
		mapa.setDescricao("Saber onde tu ta");
		mapa.setNome("Mapa");
		mapa.setPreco(5);

		/** IGNORAR POR ENQUANTO **/
		List<String> pokemons = new ArrayList<String>();
		pokemons.add("Pikachu");
		List<String> itens = new ArrayList<String>();
		itens.add("Pokebola");
		itens.add("Combo de chute nas costas");

		/** CRIANDO UM OBJETO **/
		Personagem character = new Personagem();

		// Personagem: indica qual será o tipo do objeto, como se fosse fazer
		// "int x;" e o tipo que será
		// guardado em x é apenas um valor inteiro, no caso do "Personagem
		// character", o
		// character só pode ser do tipo Personagem.

		// character: na linguagem java ele é um ponteiro que indica em que
		// local um objeto está na mémoria,
		// porém a gente diz que ele é o objeto.

		// new Personagem(): quando utiliza ele, você está chamando o construtor
		// Personagem, tudo que está
		// dentro do construtor ele vai ser executado. Ver exemplo #1.
		// quando você está criando um novo objeto, você diz que está
		// instanciando objeto
		// da classe Personagem.

		/** USANDO O OBJETO ATRAVÉS DOS MÉTODOS **/

		/* Dando valores para o objeto */
		character.setNome("Yuina");
		character.setGenero("Feminino");
		character.setCarteira(200);
		character.setPokemons(pokemons);
		character.setItens(itens);

		// nas linhas acima estou dando valores para o objeto. Esses valores são
		// armazenados lá nos atributos.
		// Nesses casos, o atributo nome = "Yuina", genero = "Feminino",
		// carteira = 200, pokemons = pokemons, itens = itens.
		// Para conseguir dar valores pros atributos, os valores precisam passar
		// por dentro do parenteses (valor).

		// Nos 2 últimos casos eles são listas. Em vez de guardar 1 valor para 1
		// atributo, como nos 3 primeiros
		// casos, ele está guardando uma lista de strings.
		// No atributo pokemons ele guarda todas strings passadas pelo metodo
		// character.setPokemons(pokemons),
		// nesse caso ele terá uma lista com ["Pikachu"].
		// No atributo itens ele guarda ["Pokebola", "Poção"].
		// Por enquanto eu decidi guardar strings, mais pra frente vai usar os
		// próprios objetos Item para isso.

		/* recuperando valores do objeto */
		String nomeDoPersonagem = character.getNome();
		String generoDoPersonagem = character.getGenero();
		int quantidadeDeDinheiroDoPersonagem = character.getCarteira();
		String primeiroPokemonDoPersonagem = character.getPokemons().get(0);
		String primeiroItemDoPersonagem = character.getItens().get(0);
		String segundoItemDoPersonagem = character.getItens().get(1);
		String nomeDoPikachu = pikachu.getNome();
		int nivelDoPikachu = pikachu.getNivel();
		String tipoPikachu = pikachu.getTipo();
		int vidaPikachu = (int) pikachu.getVida();
		String itemDescricao = pokebola.getDescricao();
		String nomeItem = pokebola.getNome();
		int precoItem = pokebola.getPreco();
		// Golpe 
		String nomeGolpe = raio.getNome();
		int danoGolpe = (int) raio.getDano();
		int quantidadeGolpe = raio.getQuantidade();
		String nomeFogo = fogo.getNome();
		int danoFogo = (int) fogo.getDano();
		int quantidadeFogo = fogo.getQuantidade();

		String nomeSegundoItem = pocao.getNome();
		String descricaoItem = pocao.getDescricao();
		int precoSegundoItem = pocao.getPreco();

		String nomeTerceiroItem = mapa.getNome();
		String descricaoTerceiroItem = mapa.getDescricao();
		int precoTerceiroItem = mapa.getPreco();
		// nas linhas acima, os valores estão sendo recuperados do objeto.

		/*
		 * imprimindo valores no console para ver que conteudo contém o objeto
		 */
		System.out.println(nomeDoPersonagem + "\n");
		System.out.println(generoDoPersonagem + "\n");
		System.out.println(quantidadeDeDinheiroDoPersonagem + "\n");
		System.out.println(primeiroPokemonDoPersonagem + "\n");
		System.out.println("Primeiro item adquirido: " + primeiroItemDoPersonagem + "\n");
		System.out.println("Segundo item adquirido: " + segundoItemDoPersonagem + "\n");
		// Pokemon
		System.out.println("Nome do Pokemon é: " + nomeDoPikachu + "\n");
		System.out.println("O nível é: " + nivelDoPikachu + "\n");
		System.out.println("Tipo é: " + tipoPikachu + "\n");
		System.out.println("Quantidade de vida é: " + vidaPikachu + "\n");
		// item
		System.out.println("O que ele faz: " + itemDescricao + "\n");
		System.out.println("Nome do Item: " + nomeItem + "\n");
		System.out.println("O preço é: " + precoItem + "\n");
		// Golpe
		System.out.println("Nome do Golpe: " + nomeGolpe + "\n");
		System.out.println("O dano é de: " + danoGolpe + "\n");
		System.out.println("Quantidades de danos: " + quantidadeGolpe + "\n");
		System.out.println("Nome do Golpe: " + nomeFogo + "\n");
		System.out.println("O dano é de: " + danoFogo + "\n");
		System.out.println("Quantidades de danos: " + quantidadeFogo + "\n");

		System.out.println(nomeSegundoItem + "\n");
		System.out.println(descricaoItem + "\n");
		System.out.println(precoSegundoItem + "\n");

		System.out.println(nomeTerceiroItem + "\n");
		System.out.println(descricaoTerceiroItem + "\n");
		System.out.println(precoTerceiroItem + "\n");
		// Obeservaçoes finais: os gets e sets não são obrigatórios, mas ele é
		// um padrão que todos utilizam e recomendo tu
		// utilizá-los por enquanto. Mais pra frente mostrarei que não precisa
		// existir eles.

	}
}