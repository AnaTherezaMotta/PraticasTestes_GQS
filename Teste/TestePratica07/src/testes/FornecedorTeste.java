package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import compras.Fornecedor;

public class FornecedorTeste {

	@Before
	public void setUp() throws Exception {
	}

	@Test
    public void testCriacaoFornecedor() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor ABC");

        assertEquals("Fornecedor ABC", fornecedor.getNome());
    }

}
