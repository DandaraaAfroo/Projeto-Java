package produto;

class ProdutoDigital extends Produto {

    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Digital - " + nome + ": R$ " + preco);
    }
}
