package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import entidade.Temperatura;

public class TemperaturaTeste {

	Temperatura objetoTemp;

	@Before
	public void setUp() throws Exception {
		objetoTemp = new Temperatura();
	}
	
	@After
	public void tearDown() throws Exception {
		objetoTemp = null;
		System.gc(); // Chamada do Garbage Collector.		
	}
	
	@Test
	public void testeConverterCelsiusParaFarenheit() {
		assertEquals("TESTE 4: ", 32, objetoTemp.celsiusParaFarenheit(0), 0);
	}
}
