package estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getNome(), produto);
    }

    public void removerProduto(String nomeProduto) {
        produtos.remove(nomeProduto);
    }

    public Produto consultarProduto(String nomeProduto) {
        return produtos.get(nomeProduto);
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos no Estoque:");
        for (Produto produto : produtos.values()) {
            System.out.println(produto.getNome() + " - Quantidade: " + produto.getQuantidade() + " - Preço: " + produto.getPreco());
        }
    }
}