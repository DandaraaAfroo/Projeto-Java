package produto;

import java.util.ArrayList;
import java.util.List;

class Carrinho implements Compra {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public void realizarCompra() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        System.out.println("Compra realizada! Total: R$ " + total);
    }
}
