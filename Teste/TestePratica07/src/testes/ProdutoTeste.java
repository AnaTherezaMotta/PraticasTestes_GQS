package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import estoque.Produto;

public class ProdutoTeste {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
    public void testCriacaoProduto() {
        Produto produto = new Produto("Fubá", 20, 6.0);

        assertEquals("Fubá", produto.getNome());
        assertEquals(20, produto.getQuantidade());
        assertEquals(6.0, produto.getPreco(), 0.01);
    }

}
