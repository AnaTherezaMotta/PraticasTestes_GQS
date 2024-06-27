package pkgTemperatura;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TemperaturaTeste {

	Temperatura objTemp;

	@Before
	public void setUp() throws Exception {
		objTemp = new Temperatura();
	}
	@Test
	public void testeDeveriaConverterCelsiusParaFarenheit() {
		assertEquals("CASO 1: ", 23, objTemp.celsiusParaFarenheit(-5), 0);
		assertEquals("CASO 2: ", 32, objTemp.celsiusParaFarenheit(0), 0);
		assertEquals("CASO 3: ", 64.40, objTemp.celsiusParaFarenheit(18), 0);
	}
	@Test
	public void testeDeveriaConverterCelsiusParaKelvin() {
		assertEquals("CASO 4: ", 268.150, objTemp.celsiusParaKelvin(-5), 0);
		assertEquals("CASO 5: ", 273.150, objTemp.celsiusParaKelvin(0), 0);
		assertEquals("CASO 6: ", 291.150, objTemp.celsiusParaKelvin(18), 0);
	}
	@Test
	public void testeDeveriaClassificarTemperatura() {
		assertTrue("CASO 7: ", "NEGATIVA" == objTemp.classificaTemperatura(-5));
		assertTrue("CASO 8: ", "ZERO" == objTemp.classificaTemperatura(0));
		assertTrue("CASO 9: ", "POSITIVA" == objTemp.classificaTemperatura(18));		
	}
	@Test
	public void testeDeveriaValidarConversaoCelsiusFarenheit() {
		assertTrue("CASO 10: ", true == objTemp.validaConversaoCelsiusFarenheit(-5, 23));		
	}
}

