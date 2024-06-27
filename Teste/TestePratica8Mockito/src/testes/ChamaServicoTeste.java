package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import org.mockito.Mockito;

import entidades.ChamaServico;
import entidades.ICalculadora;

public class ChamaServicoTeste {
    
	ChamaServico cs;
	
	@Before
	public void setUp() throws Exception {
		ICalculadora ical = Mockito.mock(ICalculadora.class);
		Mockito.when(ical.adicionar(10, 10)).thenReturn(20);
		cs = new ChamaServico();
		cs.setCalc(ical);
	}

	@After
	public void tearDown() throws Exception {
		cs = null;
		System.gc(); // Chamada do Garbage Collector.		
	}

	@Test
	public void deveriaSomarDoisNumeros() {
		assertEquals("ÚNICO", 20, cs.adicionarDoisNumeros(10, 10), 0);
	}
}
