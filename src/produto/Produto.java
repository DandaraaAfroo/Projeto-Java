package produto;

abstract class Produto {
	protected String nome;
	protected double preco;

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public abstract void exibirDetalhes();

	public double getPreco() {
		return preco;
	}

	public String getNome() {
		return nome;
	}
}
