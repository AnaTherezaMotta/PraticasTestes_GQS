package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import compras.Compra;
import estoque.Produto;

public class CompraTeste {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCriacaoCompra() {
	    Produto produto = new Produto("Fubá", 15, 6.0);
	    Compra compra = new Compra(produto, 3);

	    assertEquals(produto, compra.getProduto());
	    assertEquals(3, compra.getQuantidade());
	}

}
