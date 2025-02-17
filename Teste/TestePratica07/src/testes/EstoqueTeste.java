package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import estoque.Estoque;
import estoque.Produto;

public class EstoqueTeste {


	private Estoque estoque;

    @Before
    public void setUp() {
        estoque = new Estoque();
        Produto p1 = new Produto("Fubá", 10, 5.0);
        Produto p2 = new Produto("Feijão", 5, 7.5);
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);
    }

    @Test
    public void testAdicionarProduto() {
        Produto novoProduto = new Produto("Café", 15, 3.0);
        estoque.adicionarProduto(novoProduto);

        assertEquals(novoProduto, estoque.consultarProduto("Café"));
    }

    @Test
    public void testRemoverProduto() {
        estoque.removerProduto("Fubá");

        assertNull(estoque.consultarProduto("Fubá"));
    }

    @Test
    public void testConsultarProduto() {
        Produto produtoConsultado = estoque.consultarProduto("Feijão");

        assertEquals("Feijão", produtoConsultado.getNome());
        assertEquals(5, produtoConsultado.getQuantidade());
        assertEquals(7.5, produtoConsultado.getPreco(), 0.01);
    }


}
