package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import vendas.Cliente;

public class ClienteTeste {

	@Before
	public void setUp() throws Exception {
	}

	@Test
    public void testCriacaoCliente() {
        Cliente cliente = new Cliente("Ana");

        assertEquals("Ana", cliente.getNome());
    }

}
