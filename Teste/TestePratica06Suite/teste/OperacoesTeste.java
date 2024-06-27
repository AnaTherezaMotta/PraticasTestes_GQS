package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import entidade.Operacoes;

public class OperacoesTeste {
	
	Operacoes objetoOp;
	
	
	// @ Before é executado uma única vez:
	@Before
	public void setUp() throws Exception {
		objetoOp = new Operacoes();
	}
		
	@After
	public void tearDown() throws Exception {
		objetoOp = null;
		System.gc(); // Chamada do Garbage Collector.		
	}

	@Test
	public void testeMaiorValor() {
		// assertEquals("TEXTO ", valor esperado, objeto.método(lista de parâmetros), delta);
		assertEquals("TESTE 1:", 16, objetoOp.maiorValor(16, 9), 0); //delta = variação no valor.
	}

	@Test
	public void testeMenorValor() {
		/*
		assertTrue("TEXTO ", valor esperado ==  objeto.método(lista de parâmetros)); <- assertTrue não aceita variação (delta).
		assertFalse("TEXTO ", valor esperado ==  objeto.método(lista de parâmetros)); <- assertFalse não aceita variação (delta).
		*/
		assertTrue("TESTE 2: ", objetoOp.menorValor(16, 9) == 9);	
	}
	
	@Test
	public void testeProduto() {
		assertFalse("TESTE 3: ", objetoOp.produto(16, 5) == 81);
	}	
}
