package produto;

class ProdutoFisico extends Produto {

    public ProdutoFisico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Físico: " + nome + ": R$ " + preco);
    }
}
